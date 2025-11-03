package S18_interface;
import java.awt.Rectangle;

public class MeasurerTester {
    public static void main(String[] args) {
        // Create an array of Rectangle objects
        Rectangle[] rectangles = {
            new Rectangle(0, 0, 4, 5),
            new Rectangle(0, 0, 3, 6),
            new Rectangle(0, 0, 2, 7)
        };
        
        // Create an AreaMeasurer instance
        Measurer areaMeasurer = new AreaMeasurer();
        
        // Calculate the average area of the rectangles
        double averageArea = Data.average(rectangles, areaMeasurer);
        
        // Print the result
        System.out.println("Average Area: " + averageArea);
    }
    
}
