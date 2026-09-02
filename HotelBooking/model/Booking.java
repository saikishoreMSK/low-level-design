package model;

import java.time.LocalDate;

public class Booking {
    private String bookingId;
    private Room room;
    private Customer customer;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private double price;


    public Booking(String bookingId, Room room, Customer customer, LocalDate checkIn, LocalDate checkOut,double price) {
        this.bookingId = bookingId;
        this.room = room;
        this.customer = customer;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.price = price;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Room getRoom() {
        return room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public double getPrice(){
        return price;
    }

}
