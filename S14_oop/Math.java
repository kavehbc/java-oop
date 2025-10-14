package S14_oop;
import S05_user_inputs.Terminal;

public class Math {

    public static void main(String[] args) {
        Terminal.clear();

        System.out.println("******** SOME MATH *********");
        // division of int by int returns an integer
        // division of an int by a float/double returns a float/double
        
        System.out.println(100 / 3);
        System.out.println(100.0 / 3);
        System.out.println(100 / 3.0);

        int a = 100;
        int b = 3;
        System.out.println(a / b);
        System.out.println(a * 1.0 / b);
    
    }

}
