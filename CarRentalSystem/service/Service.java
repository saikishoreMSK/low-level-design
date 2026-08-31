package service;

import java.util.*;

import enums.VehicleType;
import model.*;
import strategy.*;

public class Service {
    List<Vehicle> vehicles;
    List<Rental> rentals;
    private PricingStrategy pricingStrategy;

    public Service(PricingStrategy pricingStrategy){
        this.pricingStrategy = pricingStrategy;
        vehicles = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        System.out.println("Vehicle added");
    }

    public void getAvailableVehicles(VehicleType type){
        List<Vehicle> available = new ArrayList<>();
        for(Vehicle vehicle : vehicles){
            if(vehicle.isAvailable() && vehicle.getType()==type){
                available.add(vehicle);
                System.out.println(vehicle.getVehicleNumber());
            }
        }
    }

    public Rental rentVehicle(Customer customer,Vehicle vehicle, int days){
        if(vehicle==null || !vehicle.isAvailable()){
            throw new IllegalArgumentException("Vehicle isn't availble");
        }
        double price = pricingStrategy.getPrice(vehicle.getType(), days);
        Rental rental = new Rental(customer, vehicle, days, price);
        vehicle.setAvailable(false);
        rentals.add(rental);
        System.out.println("Vehicle "+vehicle.getVehicleNumber()+" rented successfully for "+price+"rs");
        return rental;
    }
    public void returnVehicle(Vehicle vehicle){
        if(vehicle==null){
            throw new IllegalArgumentException("Invalid Vehicle");
        }
        vehicle.setAvailable(true);
        System.out.println("Vehicle "+vehicle.getVehicleNumber()+" returned");
    }

}
