package model;
import enums.*;
public abstract class Vehicle{
    private String vehicleNumber;
    private VehicleType type;
    private boolean available;

    public Vehicle(String vehicleNumber,VehicleType type){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.available = true;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }
    
}