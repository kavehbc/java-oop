import java.awt.Rectangle;

public class MoveTester {
    public static void main(String[] args) {
        System.out.println("************");
        System.out.print("Hello,");
        System.out.println(" World!");

        String msg = "Creating a rectangle...";
        System.out.println(msg);

        int x = 5;
        int y = 10;
        int width = 20;
        int height = 30;

        //double is similar to float, but more precise
        double area = width * height;
        System.out.println("Area is " + area);

        // Rectangle(x, y, width, height)
        Rectangle box = new Rectangle(x, y, width, height);

        //move the box
        box.translate(15, 25);

        System.out.println("Box is now at (" + box.getX() + ", " + box.getY() + ")");
    }
}
