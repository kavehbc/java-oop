package S25_gui_calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {

    private static final int FRAME_WIDTH = 350;
    private static final int FRAME_HEIGHT = 450;

    // Display
    private JTextField displayField;

    // Calculator state
    private double currentValue = 0;
    private String currentOperation = "";
    private boolean startNewNumber = true;

    public CalculatorFrame() {
        setLayout(new BorderLayout(5, 5));
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createComponents() {
        // Display field at top
        displayField = new JTextField("0");
        displayField.setFont(new Font("Arial", Font.BOLD, 32));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setEditable(false);
        displayField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        displayField.setBackground(Color.WHITE);
        add(displayField, BorderLayout.NORTH);

        // Button panel with grid layout
        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Button labels in calculator layout
        String[][] buttonLabels = {
            {"C", "CE", "←", "÷"},
            {"7", "8", "9", "×"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "+"},
            {"±", "0", ".", "="}
        };

        // Create and add buttons
        for (String[] row : buttonLabels) {
            for (String label : row) {
                JButton button = new JButton(label);
                button.setFont(new Font("Arial", Font.BOLD, 20));
                
                // Color coding
                if (label.matches("[0-9]")) {
                    button.setBackground(new Color(240, 240, 240));
                } else if (label.equals("=")) {
                    button.setBackground(new Color(0, 120, 215));
                    button.setForeground(Color.WHITE);
                } else if (label.matches("[+\\-×÷]")) {
                    button.setBackground(new Color(230, 230, 230));
                } else {
                    button.setBackground(new Color(250, 250, 250));
                }
                
                button.addActionListener(new ButtonClickListener());
                buttonPanel.add(button);
            }
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            
            // Digit buttons
            if (command.matches("[0-9]")) {
                handleDigit(command);
            }
            // Decimal point
            else if (command.equals(".")) {
                handleDecimal();
            }
            // Operations
            else if (command.matches("[+\\-×÷]")) {
                handleOperation(command);
            }
            // Equals
            else if (command.equals("=")) {
                handleEquals();
            }
            // Clear
            else if (command.equals("C")) {
                handleClear();
            }
            // Clear Entry
            else if (command.equals("CE")) {
                handleClearEntry();
            }
            // Backspace
            else if (command.equals("←")) {
                handleBackspace();
            }
            // Plus/Minus
            else if (command.equals("±")) {
                handlePlusMinus();
            }
        }
    }

    private void handleDigit(String digit) {
        if (startNewNumber) {
            displayField.setText(digit);
            startNewNumber = false;
        } else {
            String current = displayField.getText();
            if (current.equals("0")) {
                displayField.setText(digit);
            } else {
                displayField.setText(current + digit);
            }
        }
    }

    private void handleDecimal() {
        String current = displayField.getText();
        if (startNewNumber) {
            displayField.setText("0.");
            startNewNumber = false;
        } else if (!current.contains(".")) {
            displayField.setText(current + ".");
        }
    }

    private void handleOperation(String operation) {
        if (!currentOperation.isEmpty() && !startNewNumber) {
            handleEquals();
        }
        
        currentValue = Double.parseDouble(displayField.getText());
        currentOperation = operation;
        startNewNumber = true;
    }

    private void handleEquals() {
        if (currentOperation.isEmpty()) {
            return;
        }

        double secondValue = Double.parseDouble(displayField.getText());
        double result = 0;
        boolean error = false;

        switch (currentOperation) {
            case "+":
                result = currentValue + secondValue;
                break;
            case "-":
                result = currentValue - secondValue;
                break;
            case "×":
                result = currentValue * secondValue;
                break;
            case "÷":
                if (secondValue == 0) {
                    displayField.setText("Error: Div by 0");
                    error = true;
                } else {
                    result = currentValue / secondValue;
                }
                break;
        }

        if (!error) {
            // Format result to remove unnecessary decimals
            if (result == (long) result) {
                displayField.setText(String.format("%d", (long) result));
            } else {
                displayField.setText(String.format("%.8f", result).replaceAll("0*$", "").replaceAll("\\.$", ""));
            }
        }

        currentOperation = "";
        startNewNumber = true;
    }

    private void handleClear() {
        displayField.setText("0");
        currentValue = 0;
        currentOperation = "";
        startNewNumber = true;
    }

    private void handleClearEntry() {
        displayField.setText("0");
        startNewNumber = true;
    }

    private void handleBackspace() {
        String current = displayField.getText();
        if (!startNewNumber && current.length() > 1) {
            displayField.setText(current.substring(0, current.length() - 1));
        } else {
            displayField.setText("0");
            startNewNumber = true;
        }
    }

    private void handlePlusMinus() {
        String current = displayField.getText();
        if (!current.equals("0")) {
            if (current.startsWith("-")) {
                displayField.setText(current.substring(1));
            } else {
                displayField.setText("-" + current);
            }
        }
    }
}
