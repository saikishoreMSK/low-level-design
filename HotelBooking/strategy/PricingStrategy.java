package strategy;

import java.time.LocalDate;

import model.Room;

public interface PricingStrategy {
    public double calculatePrice(Room room, LocalDate checkIn, LocalDate checkOut);
    
}
