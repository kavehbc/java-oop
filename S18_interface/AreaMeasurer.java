package S18_interface;
import java.awt.Rectangle;

public class AreaMeasurer implements Measurer {
    
    @Override
    public double measure(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) obj;
            double area = rectangle.getWidth() * rectangle.getHeight();
            return area;
        }
        throw new IllegalArgumentException("Object is not a Rectangle");
    }
    
}
