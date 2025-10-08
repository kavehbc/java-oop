package S05_user_inputs;

import javax.swing.JOptionPane;

public class UserInputDialog {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name:");

        int age = -1;
        boolean validInput = false;

        // repeating user input as many as required until valid input is given
        while (!validInput) {
            String ageInput = JOptionPane.showInputDialog("Enter your age:");
            try {
                age = Integer.parseInt(ageInput);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Invalid input. Please enter a valid age.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null, "Hello, " + name + "!\nYou are " + age + " years old.");

    }
}
