import enums.VehicleType;
import factory.VehicleFactory;
import model.Customer;
import model.Vehicle;
import service.*;
import strategy.NormalStrategy;
import strategy.PricingStrategy;

public class Main{
    public static void main(String[] args){
        PricingStrategy pricingStrategy = new NormalStrategy();
        Service service = new Service(pricingStrategy);

        Vehicle car1 = VehicleFactory.getVehicle("car1", VehicleType.CAR);
        Customer customer1 = new Customer(1, "Saikishore");

        service.addVehicle(car1);

        service.getAvailableVehicles(VehicleType.BIKE);
        service.getAvailableVehicles(VehicleType.CAR);

        service.rentVehicle(customer1, car1, 4);
        service.returnVehicle(car1);
    }
}