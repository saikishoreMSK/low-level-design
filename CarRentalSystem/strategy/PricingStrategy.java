package strategy;

import enums.VehicleType;

public interface PricingStrategy {
    public double getPrice(VehicleType vehicleType, int days);
}
