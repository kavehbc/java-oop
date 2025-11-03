package S20_interface_vehicle;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    @Override
    public int getNumberOfWheels() {
        return 4;
    }
    
}
