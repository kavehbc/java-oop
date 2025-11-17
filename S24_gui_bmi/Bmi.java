package S24_gui_bmi;

import javax.swing.JFrame;

public class Bmi {
    public static void main(String[] args) {
        BmiFrame frame = new BmiFrame();
        frame.setTitle("BMI Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
