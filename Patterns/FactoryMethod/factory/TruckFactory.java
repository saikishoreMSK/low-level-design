package factory;

import vehicle.Truck;
import vehicle.Vehicle;

public class TruckFactory implements Factory{
    @Override
    public Vehicle createVehicle(){
        return new Truck();
    }
}
