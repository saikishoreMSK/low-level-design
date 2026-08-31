package factory;

import enums.VehicleType;
import model.*;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleNumber,VehicleType type){
        if(type.equals(VehicleType.CAR)){
            return new Car(vehicleNumber);
        }
        if(type.equals(VehicleType.BIKE)){
            return new Bike(vehicleNumber);
        }
        throw new IllegalArgumentException("Invalid Vehicle Type");
    }
}
