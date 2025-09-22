import java.awt.Rectangle;

public class Variables {
    public static void main(String[] args) {
        int x1 = 5;
        int x2 = x1;

        System.out.println("x1 is " + x1);
        System.out.println("x2 is " + x2);

        x2 = 10;
        System.out.println("After changing x2...");
        System.out.println("x1 is " + x1);
        System.out.println("x2 is " + x2);

        System.out.println("************");
        Rectangle box1 = new Rectangle(5, 10, 20, 30);
        Rectangle box2 = box1;

        System.out.println("box1 is at (" + box1.getX() + ", " + box1.getY() + ")");
        System.out.println("box2 is at (" + box2.getX() + ", " + box2.getY() + ")");

        box2.translate(15, 25); //move box2 15 right and 25 down: (20, 35)
        System.out.println("After moving box2...");
        System.out.println("box1 is at (" + box1.getX() + ", " + box1.getY() + ")");
        System.out.println("box2 is at (" + box2.getX() + ", " + box2.getY() + ")");

        System.out.println("************");
        
        String str1 = "Hello";
        String str2 = str1;

        System.out.println("str1 is " + str1);
        System.out.println("str2 is " + str2);
        str2 = "Goodbye";
        System.out.println("After changing str2...");
        System.out.println("str1 is " + str1);
        System.out.println("str2 is " + str2);
    }
}
