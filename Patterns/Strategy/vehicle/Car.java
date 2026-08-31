package vehicle;

import strategy.DriveStrategy;
import strategy.NormalStrategy;

public class Car extends Vehicle{

    public Car() {
        super(new NormalStrategy());
    }
    
}
