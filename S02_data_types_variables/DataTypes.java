
package S02_data_types_variables;

public class DataTypes {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        //integer types
        byte b = 127; //1 byte, -128 to 127
        short s = 32000; //2 bytes, -32,768 to 32,767
        int i = 2000000000; //4 bytes, -2 billion to +2 billion
        long l = 9000000000L; //8 bytes, really big numbers (–9,223,372,036,854,775,808 . . . 9,223,372,036,854,775,807)

        //floating point types
        float f = 3.14159f; //4 bytes, about 7 digits of precision
        double d = 3.141592653589793; //8 bytes, about 16 digits of precision

        //other primitive types
        char c = 'A'; //2 bytes, single character/letter
        boolean bool = true; //1 bit, true or false

        //non-primitive type: String (not a primitive type)
        String str = "Hello"; //a sequence of characters

        //constants - object name is all uppercase by convention
        final double PI = 3.14159; //a variable that cannot be changed
        // PI = 3.15; //this will cause an error

        System.out.println("Result: " + (100/3)); //integer division, result is an integer
        System.out.println("Result: " + (100/3.0)); //floating point division, result is a double
        System.out.println("Result: " + (100.0/3)); //floating point division, result is a double

    }
    }
