package strategy;

import enums.VehicleType;

public class NormalStrategy implements PricingStrategy{
    @Override
    public double getPrice(VehicleType vehicleType, int days){
        if(vehicleType==VehicleType.CAR){
            return 20*days;
        }
        if(vehicleType==VehicleType.BIKE){
            return 10*days;
        }
        return 30*days;
    }
}
