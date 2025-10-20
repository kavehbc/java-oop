package S16_final_static_excercise;

public class TestNumber {
    public static void main(String[] args) {
 
        Number num = new Number(2);
 
        System.out.println("Addition: " + num.value + " + " + 2 + " = " +
        num.add(2));
        System.out.println("Multiplication: " + num.value + " * " + 5 + " = " +
        num.multiply(5));
 
        System.out.println("Earth Gravity:" + Number.getEarthgravity());
        System.out.println("PI:" + Number.getPi());
        System.out.println("Number E:" + Number.getE());
       
    }
}