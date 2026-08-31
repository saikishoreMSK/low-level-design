package vehicle;
import strategy.DriveStrategy;
import strategy.SportsStrategy;

public class SportsCar extends Vehicle{

    public SportsCar() {
        super(new SportsStrategy());
    }

}