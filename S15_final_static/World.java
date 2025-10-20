package S15_final_static;

import S05_user_inputs.Terminal;

public class World {

    public static void main(String[] args) {
        Terminal.clear();

        Human h1 = new Human("Jack");
        Human h2 = new Human("Mary");
        Human h3 = new Human("Hilary");
        Human h4 = new Human();

        h1.walk();
        h2.talk();

        // I want to check the population
        Human.getPopulation();

        // Human.pi = 3.20; // raises an errro
        System.out.println("PI: " + Human.pi);
    }
    
}
