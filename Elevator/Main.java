import java.util.Arrays;
import java.util.List;

import model.Elevator;
import service.ElevatorSystem;
import strategy.*;

public class Main{
    public static void main(String[] args) {
        Elevator elevator1 = new Elevator(1, 1);
        Elevator elevator2 = new Elevator(2, 12);
        List<Elevator> elevators = Arrays.asList(elevator1,elevator2);

        ElevatorStrategy strategy = new NearestElevatorStrategy();

        ElevatorSystem system = new ElevatorSystem(elevators, strategy);

        system.requestElevator(15, 10);
    }
}