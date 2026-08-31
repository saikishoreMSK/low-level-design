package factory;

import vehicle.Car;
import vehicle.Truck;
import vehicle.Vehicle;

public class Factory {

    public static Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("Car")){
            return new Car();
        }
        if(type.equalsIgnoreCase("Truck")){
            return new Truck();
        }
        throw new IllegalArgumentException("Invalid Vehicle");
    }
}
