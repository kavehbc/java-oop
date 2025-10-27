package S17_inheritance;
import java.util.Scanner;
import S05_user_inputs.Terminal;

public class Demo {
    public static void main(String[] args) {
        Terminal.clear();

        // Question q1 = new Question("What is the capital of France?", "Paris");
        // q1.display();

        ChoiceQuestion q1 = new ChoiceQuestion();
        q1.setText("What is the capital of France?");
        q1.addChoice("Berlin", false);
        q1.addChoice("Madrid", false);
        q1.addChoice("Paris", true);
        q1.addChoice("Rome", false);

        q1.display();

        // ask user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine();

        if (q1.checkAnswer(userAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }

        scanner.close();
    }
}
