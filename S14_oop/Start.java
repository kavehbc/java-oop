package S14_oop;
import S05_user_inputs.Terminal;

public class Start {
    public static void main(String[] args) {
        Terminal.clear();

        Student st1 = new Student("Kaveh", 40, 180, 85);
        Student st2 = new Student();

        st1.name = "Kaveh";
        st2.name = "John";
        //st1.age; // private
        //st1.weight; // protected

        //st1.setAge(30);
        //st1.getBMI();

        System.out.println("-- Age: " + st1.getAge());

        st1.printInfo();
    }
}
