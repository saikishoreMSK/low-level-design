package model;

import enums.*;

public class Elevator {
    private int id;
    private int currentFloor;
    private Direction direction;
    private DoorState state;

    public Elevator(int id, int currentFloor){
        this.id=id;
        this.currentFloor=currentFloor;
        this.direction=Direction.IDLE;
        this.state=DoorState.CLOSED;
    }

    public void moveToFloor(int destinationFloor){
        if(currentFloor == destinationFloor){
            System.out.println("You're currently at same floor");
            return;
        }
        direction = destinationFloor > currentFloor ? Direction.UP : Direction.DOWN;
        System.out.println("Elevator "+id+" moving from floor "+currentFloor+" to "+destinationFloor);
        currentFloor = destinationFloor;
        direction= Direction.IDLE;
        return;
    }

    public void openDoor(){
        System.out.println("Elevator "+id+" door opened");
        state = DoorState.OPEN;
    }
    public void closeDoor(){
        state=DoorState.CLOSED;
        System.out.println("Elevator "+id+" door closed");
    }

    public int getId() {
        return id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public DoorState getState() {
        return state;
    }
}