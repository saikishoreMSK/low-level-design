package strategy;

import java.util.List;

import model.Elevator;
import model.Request;

public class NearestElevatorStrategy implements ElevatorStrategy{

    @Override
    public Elevator selectElevator(List<Elevator> elevators, Request request) {
        Elevator bestElevator = null;
        int minDis = Integer.MAX_VALUE;

        for(Elevator elevator : elevators){
            int dis = Math.abs(elevator.getCurrentFloor()-request.getSource());
            if(dis<minDis){
                minDis = dis;
                bestElevator = elevator;
            }
        }
        return bestElevator;
    }
    
}
