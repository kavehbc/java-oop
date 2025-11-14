package S23_gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class KeyPad extends JFrame {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    public KeyPad(String title) {
        super(title);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        createUI();
    }

    private void createUI() {
        // UI creation logic goes here
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("*"));
        panel.add(new JButton("0"));
        panel.add(new JButton("#"));
        add(panel);
    }
    public static void main(String[] args) {
        JFrame frame = new KeyPad("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    

}
