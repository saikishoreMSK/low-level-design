package strategy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import enums.RoomType;
import model.Room;

public class StandardPricingStrategy implements PricingStrategy{

    public double calculatePrice(Room room, LocalDate checkin, LocalDate checkout){
        long days = ChronoUnit.DAYS.between(checkin, checkout);
        if(days<=0){
            throw new IllegalArgumentException("Checkin should be before chekcout");
        }
        if(room.getRoomType()==RoomType.SINGLE){
            return days*1000;
        }else if(room.getRoomType()==RoomType.DOUBLE){
            return days*2000;
        }
        return days*3000;
    }
}