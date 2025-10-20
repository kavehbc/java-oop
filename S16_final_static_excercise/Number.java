package S15_final_static;

public class Number {
    public double value;
    public static final double PI = 3.14;
    public static final double E = 2.71828;
    public static final double EARTHGRAVITY = 9.807;
 
    //constructor to give it a value
    public Number(double initialNumber){
        this.value = initialNumber;
    }
 
    public double add(double number){
        return this.value + number;
    }
 
    public double multiply(double number){
        return this.value * number;
    }
 
    public static double getE() {
        return E;
    }
 
    public static double getPi() {
        return PI;
    }
 
    public static double getEarthgravity() {
        return EARTHGRAVITY;
    }
 
 
 
}