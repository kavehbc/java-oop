package S20_interface_vehicle;

public class Truck implements Vehicle {

    @Override
    public void start() {
        System.out.println("Truck is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping.");
    }

    @Override
    public int getNumberOfWheels() {
        return 6;
    }
    
}
