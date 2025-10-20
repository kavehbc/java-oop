package S15_final_static;

public class Static {
    
    public static int age = 20;
    public int weight;

    public Static(){
        System.out.println("Static constructor is called.");
    }

    public static void run() {
        System.out.println("Static RUN method");
        System.out.println("Age: " + age);
    }

    public void test(){
        System.out.println("Public test method");
    }


}
