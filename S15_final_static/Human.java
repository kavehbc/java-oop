package S15_final_static;

public class Human {
    
    public int age;
    public String name;
    public static int population = 0;
    public static final double pi = 3.14;
    public static final int numberOfEyes = 2;

    public Human(){
        System.out.println("Constructor without argument");
        // this runs on Java 25 and above
        // this("Undefined");
    }

    public Human(String name){
        System.out.println("Constructor with argument");
        this.name = name;
        population++;
    }

    public void walk(){
        System.out.println(this.name + " is walking...");
    }

    public void talk(){
        System.out.println(this.name + " is talking...");
        hello();
    }

    public static void getPopulation(){
        System.out.println("Population is: " + population);
    }

    private void hello(){
        System.out.println("Hello, how are you?");
    }
}
