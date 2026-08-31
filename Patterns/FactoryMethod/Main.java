import factory.*;
import vehicle.*;

public class Main{
    public static void main(String[] args) {
        Factory factory1 = new TruckFactory();
        Vehicle vehicle1 = factory1.createVehicle();
        vehicle1.display();
    }
}