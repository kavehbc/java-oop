import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Terminal.clear();
        // Write your program here
        System.out.println("Guessing Game!");
        // initializing the scanner
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        int maxNumber = 0;

        System.out.print("Enter the maximum number: ");
        while (!validInput) {
            if (scanner.hasNextInt()) {
                maxNumber = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter the maximum number: ");
                scanner.next(); // clear the invalid input
            }
        }

        // system takes a random number between 1 and maxNumber
        // Math.random() generates a random double between 0.0 and 1.0
        // random between 1 and maxNumber: (Math.random() * maxNumber) + 1
        int randomNumber = (int) (Math.random() * maxNumber) + 1;

        System.out.println("I have selected a number between 1 and " + maxNumber + ". Try to guess it!");
        System.out.println("");

        int guess = 0;
        int attempts = 0;
        boolean gameWon = false;

        while (!gameWon) {
            validInput = false;
            System.out.print("What is your guess: ");
            while (!validInput) {
                if (scanner.hasNextInt()) {
                    guess = scanner.nextInt();
                    attempts++;
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    System.out.print("What is your guess: ");
                    scanner.next(); // clear the invalid input
                }
            }

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                gameWon = true;
            } else if (guess < randomNumber) {
                System.out.println("My number is higher.");
            } else {
                System.out.println("My number is lower.");
            }

        }
        scanner.close();

    }
}
