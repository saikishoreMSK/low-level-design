import model.*;

import java.time.LocalDate;

import enums.*;
import service.*;
import strategy.*;


public class Main{
    public static void main(String[] args) {
        Hotel hotel = new Hotel("h1", "OYO");
        PricingStrategy pricingStrategy = new StandardPricingStrategy();
        HotelService service = new HotelService(hotel, pricingStrategy);

        //add rooms
        Room room1 = new Room(1, RoomType.SINGLE);
        Room room2 = new Room(2, RoomType.DOUBLE);
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        //customer
        Customer customer = new Customer("c1", "Sai");

        LocalDate checkin = LocalDate.of(2026, 9, 15);
        LocalDate checkout= LocalDate.of(2026, 9, 20);
        service.getAvailableRooms(RoomType.SINGLE, checkin,checkout);
        service.bookRoom(customer,  room1, checkin,checkout);
        
    }
}