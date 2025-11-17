package S25_gui_calculator;

import javax.swing.JFrame;

public class Calculator {
    public static void main(String[] args) {
        CalculatorFrame frame = new CalculatorFrame();
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
