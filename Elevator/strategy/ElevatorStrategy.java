package strategy;
import java.util.*;
import model.*;
public interface ElevatorStrategy {
    public Elevator selectElevator(List<Elevator> elevators,Request request);
}