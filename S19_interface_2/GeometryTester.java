package S19_interface_2;

public class GeometryTester {
    public static void main(String[] args) {

        // Object circle = new Circle(5);
        // Object rectangle = new Rectangle(4, 6);

        // Circle circle = new Circle(5);
        // Rectangle rectangle = new Rectangle(4, 6);

        Geometry circle = new Circle(5);
        Geometry rectangle = new Rectangle(4, 6);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
    }
    
}
