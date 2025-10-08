package S08_pattern_print;
import S05_user_inputs.Terminal;
import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {

        Terminal.clear();

        System.out.println("Pattern Print Program");
        System.out.println("---------------------");

        Scanner scanner = new Scanner(System.in);

        // showing the options to select
        int totalOptions = 5;
        System.out.println("1. Triangle Pattern");
        System.out.println("2. Double Triangle Pattern");
        System.out.println("3. Squared Number Pattern");
        System.out.println("4. Spiral Number Pattern");
        System.out.println("5. Exit");
        System.out.println();

        int choice = 0;
        boolean validChoice = false;
        while (!validChoice) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice <= totalOptions) {
                    validChoice = true;
                } else {
                    System.out.println("Invalid choice.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }

        switch (choice) {
            case 1:
                printTriangle();
                break;
            case 2:
                printDoubleTriangle();
                break;
            case 3:
                printSquaredNumberPattern();
                break;
            case 4:
                printSpiralNumberPattern();
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static void showMenu(){

        
    }
    public static int getN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = 0;
        boolean validInput = false;
        while (!validInput) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    validInput = true;
                } else {
                    System.out.print("Please enter a positive integer: ");
                }
            } else {
                System.out.print("Invalid input. Please enter a positive integer: ");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.close();
        return n;
    }

    public static void printTriangle() {
        // print the follwowing pattern
        // ask the user for a number
        // int n = 5; // Example number, replace with user input if needed
        // *
        // **
        // ***
        // ****
        // *****

        int n = getN();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printDoubleTriangle() {
        // print the follwowing pattern
        // ask the user for a number
        // int n = 5; // Example number, replace with user input if needed
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *

        int n = getN();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printSquaredNumberPattern() {
        // for a given number n, print the following pattern
        // if n = 5
        //
        // 01 02 03 04 05
        // 06 07 08 09 10
        // 11 12 13 14 15
        // 16 17 18 19 20
        // 21 22 23 24 25

        int n = getN();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // printf takes two arguments, the first is the format
                // the second is the value to be formatted
                // %02d means print an integer with at least 2 digits, pad with zeros if necessary
                System.out.printf("%02d ", (i - 1) * n + j);
            }
            System.out.println();
        }

    }

    public static void printSpiralNumberPattern() {
        // for a given number n, print the following pattern
        // if n = 5
        //
        // 01 02 03 04 05
        // 16 17 18 19 06
        // 15 24 25 20 07
        // 14 23 22 21 08
        // 13 12 11 10 09

        int n = getN();
        int[][] matrix = new int[n][n];

        int value = 1;
        int minRow = 0;
        int maxRow = n - 1;
        int minCol = 0;
        int maxCol = n - 1;

        // populate the matrix in a spiral order
        while (value <= n * n) {
            
            for (int i = minCol; i <= maxCol; i++) {
                matrix[minRow][i] = value++;
            }
            minRow++;
            for (int i = minRow; i <= maxRow; i++) {
                matrix[i][maxCol] = value++;
            }
            maxCol--;
            for (int i = maxCol; i >= minCol; i--) {
                matrix[maxRow][i] = value++;
            }
            maxRow--;
            for (int i = maxRow; i >= minRow; i--) {
                matrix[i][minCol] = value++;
            }
            minCol++;
        }

        // print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%02d ", matrix[i][j]);
            }
            System.out.println();
        }

    }
}
