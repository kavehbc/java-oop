package S20_interface_vehicle;

public class Bicycle implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bicycle is running.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle is stopping.");
    }

    @Override
    public int getNumberOfWheels() {
        return 2;
    }
    
}
