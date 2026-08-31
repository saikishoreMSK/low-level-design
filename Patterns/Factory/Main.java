import factory.Factory;
import vehicle.Vehicle;

public class Main{
    public static void main(String[] args) {
        Vehicle vehicle1 = Factory.getVehicle("Car");
        vehicle1.drive();
    }
}