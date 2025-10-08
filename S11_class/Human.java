package S11_class;

public class Human implements AutoCloseable {

    // class variables
    private String name = "John Doe";
    private int age = 30;
    private String gender = "Male";
    private double height = 1.75; // in meters
    private double weight = 70.0; // in kilograms
    public static int population = 0;

    // constructor
    public Human(String name, int age, String gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.population++;
        breathe();
        heartBeat();
    }

    @Override
    public void close() {
        this.population--;
        System.out.println(this.name + " has been removed from the population.");
    }

    public void kill(){
        close();
    }
    
    // destructor is deprecated in Java
    // public finalize() {
    //     this.population--;
    // }

    // sample static method
    public static int getPopulation() {
        return population;
    }

    public String introduce() {
        return "Hello, I am " + this.name + ", a " + this.age + " years old " + this.gender + " with a height of " + this.height + "m and weight of " + this.weight + "kg.";
    }

    private void heartBeat() {
        System.out.println("Heart is beating...");
    }

    private void breathe() {
        System.out.println("Breathing...");
    }
}
