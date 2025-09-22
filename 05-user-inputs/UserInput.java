import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Terminal.clear();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            int age = -1;
            boolean validInput = false;

            // repeating user input as many as required until valid input is given
            while (!validInput) {
                System.out.print("Enter your age: ");
                if (scanner.hasNextInt()) {
                    age = scanner.nextInt();
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid age.");
                    scanner.next(); // clear the invalid input
                }
            }

            System.out.println("Hello, " + name + "!");
            System.out.println("You are " + age + " years old.");

        } catch (Exception e) {
            System.out.println("Invalid input. Enter an integer.");
        } finally {
            // We have to remember to close the scanner to avoid resource leaks
            scanner.close();
        }

    }

}
