package S24_gui_bmi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BmiFrame extends JFrame {

    private JLabel display;
    private JTextField heightField;
    private JTextField weightField;
    private JComboBox<String> heightUnitCombo;
    private JComboBox<String> weightUnitCombo;
    private JButton calculateButton;
    
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 200;

    public BmiFrame() {
        display = new JLabel("BMI: 0.0");
        display.setFont(display.getFont().deriveFont(24.0f));
        display.setHorizontalAlignment(JLabel.CENTER);

        add(display, BorderLayout.NORTH);
        
        createComponents();
        setResizable(false);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createComponents() {
        // Create input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 3, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Height components
        JLabel heightLabel = new JLabel("Height:");
        heightField = new JTextField(10);
        heightUnitCombo = new JComboBox<>(new String[]{"cm", "in"});
        
        // Weight components
        JLabel weightLabel = new JLabel("Weight:");
        weightField = new JTextField(10);
        weightUnitCombo = new JComboBox<>(new String[]{"kg", "lb"});
        
        // Add components to panel
        inputPanel.add(heightLabel);
        inputPanel.add(heightField);
        inputPanel.add(heightUnitCombo);
        
        inputPanel.add(weightLabel);
        inputPanel.add(weightField);
        inputPanel.add(weightUnitCombo);
        
        // Calculate button
        calculateButton = new JButton("Calculate BMI");
        calculateButton.addActionListener(new CalculateListener());
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(calculateButton);
        
        // Add panels to frame
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    private class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            try {
                // Get input values
                double height = Double.parseDouble(heightField.getText());
                double weight = Double.parseDouble(weightField.getText());
                String heightUnit = (String) heightUnitCombo.getSelectedItem();
                String weightUnit = (String) weightUnitCombo.getSelectedItem();
                
                // Convert to metric (cm and kg)
                if (heightUnit.equals("in")) {
                    height = height * 2.54; // inches to cm
                }
                if (weightUnit.equals("lb")) {
                    weight = weight * 0.453592; // pounds to kg
                }
                
                // Convert height to meters
                height = height / 100.0;
                
                // Calculate BMI
                double bmi = weight / (height * height); // Math.pow(height, 2);
                
                // Optional: Add BMI category
                String category = getBmiCategory(bmi);
                
                // Display result
                display.setText(String.format("BMI: %.2f (%s)", bmi, category));
                // display.setText("BMI: " + bmi + " (" + category + ")");
                
                display.setToolTipText(category);
                
            } catch (NumberFormatException e) {
                display.setText("Invalid input!");
            }
        }
    }
    
    private String getBmiCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else if (bmi < 35) {
            return "Class 1 Obesity";
        }else if (bmi < 40) {
            return "Class 2 Obesity";
        } else {
            return "Class 3 Obesity";
        }
    }
}
