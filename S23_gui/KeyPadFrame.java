package S23_gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyPadFrame extends JFrame {

    private JLabel display;

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 300;
    public KeyPadFrame() {
        // constructor
        
        display = new JLabel("0");
        // set to bold and bigger font
        display.setFont(display.getFont().deriveFont(24.0f));

        add(display, BorderLayout.NORTH);
        
        createComponents();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
    }
    
    class DigitButtonListener implements ActionListener{
        // implement action listener
        private String digit;

        public DigitButtonListener(String digit) {
            this.digit = digit;
        }

        public void actionPerformed(ActionEvent e) {
            // update display when button is pressed
            String currentText = display.getText();
            if (currentText.equals("0")) {
                display.setText(digit);
            } else if (digit.equals("CLR")) {
                display.setText("0");
            } else {
                display.setText(currentText + digit);
            }
        }

    }

    public JButton makeDigitButton(String digit) {
        JButton button = new JButton(digit);
        // adding listerner to button
        ActionListener listener = new DigitButtonListener(digit);
        button.addActionListener(listener);
        return button;
    }

    private void createComponents() {
        // create components
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 3));

        // Add buttons to the panel
        for (int i = 1; i <= 9; i++) {
            buttonPanel.add(makeDigitButton(String.valueOf(i)));
        }

        buttonPanel.add(makeDigitButton("*"));
        buttonPanel.add(makeDigitButton("0"));
        buttonPanel.add(makeDigitButton("#"));

        add(buttonPanel, BorderLayout.CENTER);

        JButton clearButton = new JButton("Clear");
        ActionListener listener = new DigitButtonListener("CLR");
        clearButton.addActionListener(listener);

        // clearButton.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         display.setText("0");
        //     }
        // });
        add(clearButton, BorderLayout.SOUTH);
    }
}
