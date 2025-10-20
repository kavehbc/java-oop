package S15_final_static;

import S05_user_inputs.Terminal;

public class Start {
    public static void main(String[] args) {
        // clean the terminal
        Terminal.clear();

        Static obj = new Static();
        obj.test();
        // obj.run();

        Static.run();

        obj.age = 20;
        System.out.println("obj: Age is " + obj.age);
        System.out.println("obj: Weight is " + obj.weight);

        Static obj2 = new Static();
        System.out.println("obj2: Age is " + obj2.age);

        System.out.println("Class: Age is " + Static.age);
    }
}
