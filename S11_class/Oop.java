package S11_class;

public class Oop implements AutoCloseable {

    public static void main(String[] args) {

        Human alice = new Human("Alice", 28, "Female", 1.65, 55.0);
        Human jack = new Human("Jack", 32, "Male", 1.80, 75.0);
        Human john = new Human("John", 40, "Male", 1.75, 80.0);
        System.out.println(alice.introduce());
        System.out.println(jack.introduce());
        System.out.println(john.introduce());
        generatePopulation();
        // heartBeat is private method, so it cannot be accessed outside the class
        //man.heartBeat();

        //Dice dice = new Dice();
        System.out.println("Rolling the dice: " + Dice.roll());

        System.out.println("World population: " + Human.getPopulation());

        // accessing private variable directly is not allowed
        //System.out.println("Human name: " + man.name);
    }

    public static void generatePopulation() {
        Human h1 = new Human("A", 25, "Female", 1.70, 60.0);
        Human h2 = new Human("B", 30, "Male", 1.80, 75.0);
        Human h3 = new Human("C", 35, "Non-binary", 1.75, 70.0);
        
        h1.kill();
        h2.kill();
        h3.kill();
    }

    @Override
    public void close() {
        System.out.println("Oop class is being closed.");
        // Close any resources if needed
    }
}
