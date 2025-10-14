package S14_oop;

public class Student {

    // define variables
    public String name;
    private int age;
    private int height;
    protected int weight;

    // constructor
    public Student(){
        System.out.println("Constructor #1 is executed.");
    }

    public Student(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        System.out.println("Constructor #2 is executed.");
    }

    public Student(String name){
        System.out.println("Constructor #3 is executed.");
    }

    // define methods / functions
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("BMI: " + getBMI());
    }

    private double getBMI() {
        double height = this.height / 100.0; // converting to Meters
        double bmi = (double) (weight * 1.0) / (height * height);
        return bmi;
    }

    // getter
    public int getAge() {
        return age;
    }

    // setter
    public void setAge(int value) {
        age = value;
    }

}
