package S20_interface_vehicle;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBicycle = new Bicycle();
        Vehicle myTruck = new Truck();

        myCar.start();
        System.out.println("Car has " + myCar.getNumberOfWheels() + " wheels.");
        myCar.stop();

        myBicycle.start();
        System.out.println("Bicycle has " + myBicycle.getNumberOfWheels() + " wheels.");
        myBicycle.stop();

        myTruck.start();
        System.out.println("Truck has " + myTruck.getNumberOfWheels() + " wheels.");
        myTruck.stop();
    }
    
}
