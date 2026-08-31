package factory;

import vehicle.Airplane;
import vehicle.Vehicle;

public class AirplaneFactory implements Factory{
    
    @Override
    public Vehicle createVehicle(){
        return new Airplane();
    }
}
