package service;

import java.util.*;
import java.time.LocalDate;

import model.*;
import enums.*;
import strategy.*;

public class HotelService{
    private Hotel hotel;
    private PricingStrategy pricingStrategy;
    private List<Booking> bookings;

    private int bookingId=1;

    public HotelService(Hotel hotel, PricingStrategy pricingStrategy){
        this.hotel = hotel;
        this.pricingStrategy=pricingStrategy;
        this.bookings = new ArrayList<>();
    }

    //1 search available rooms
    public void getAvailableRooms(RoomType roomType, LocalDate checkin, LocalDate checkout){
        System.out.println("Available Rooms:- ");
        for(Room room : hotel.getRooms()){
            if(room.getRoomType()!=roomType) continue;
            if(isAvailable(room, checkin, checkout)){
                System.out.println("Room :"+room.getRoomno()+" is available");
            }
        }
    }
    //2Book room
    public Booking bookRoom(Customer customer, Room room, LocalDate checkin, LocalDate checkout){
        validDates(checkin,checkout);
        if(!isAvailable(room, checkin, checkout)){
            System.out.println("The room isn't available");
            return null;
        }
        double price = pricingStrategy.calculatePrice(room, checkin, checkout);
        Booking booking = new Booking("B"+bookingId++,room, customer, checkin, checkout,price);
        bookings.add(booking);
        System.out.println("The room"+room.getRoomno()+" has been successfully booked "+customer.getName());
        return booking;

    }

    public void cancelRoom(String bookingId){
        for(Booking booking : bookings){
            if(booking.getBookingId().equals(bookingId)){
                bookings.remove(booking);
                System.out.println("Successfully Cancelled");
            }
        }
    }

    private boolean isAvailable(Room room, LocalDate checkin, LocalDate checkout) {
        validDates(checkin, checkout);
        for(Booking booking : bookings){
            if(booking.getRoom()!=room) continue;
            if(hasOverLap(booking.getCheckIn(),booking.getCheckOut(),checkin,checkout)){
                System.out.println("Dates got over lapped, give proper dates");
                return false;
            }
        }
        return true;
    }


    private boolean hasOverLap(LocalDate existingCheckin, LocalDate existingCheckout,LocalDate newCheckin, LocalDate newCheckout) {
        validDates(newCheckin, newCheckout);
        validDates(existingCheckin, existingCheckout);
        return existingCheckin.isBefore(newCheckout) && newCheckin.isBefore(existingCheckout); 
    }

    private boolean validDates(LocalDate checkin, LocalDate checkout) {
        if(checkin.isAfter(checkout) || checkin==null || checkout==null){
            throw new IllegalArgumentException("values are null OR Checkin should be before Checkout");
        }
        return checkin.isBefore(checkout);
    }

    
}