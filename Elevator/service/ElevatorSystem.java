package service;

import java.util.*;
import model.*;
import strategy.ElevatorStrategy;

public class ElevatorSystem {
    private List<Elevator> elevators;
    private ElevatorStrategy strategy;

    public ElevatorSystem(List<Elevator> elevators,ElevatorStrategy strategy){
        this.elevators = elevators;
        this.strategy  = strategy;
    }

    public void requestElevator(int srcFloor, int destFloor){
        Request request = new Request(srcFloor, destFloor);
        Elevator elevator = strategy.selectElevator(elevators, request);

        if(elevator == null){
            System.out.println("No Elevator available");
            return;
        }
        
        System.out.println("Elevator "+elevator.getId()+" got selected");
        elevator.moveToFloor(request.getSource());
        elevator.openDoor();
        System.out.println("passenger entered");
        elevator.closeDoor();

        elevator.moveToFloor(request.getDestination());
        System.out.println("Passenger reached destination");
        elevator.closeDoor();
    }
}
