package S23_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InvestmentFrame extends JFrame{
    
    private static final int FRAME_WIDTH = 1000;
    private static final int FRAME_HEIGHT = 250;

    private static final double DEFAULT_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;

    private JLabel rateLabel;
    private JTextField rateField;
    private JButton button;
    private JLabel resultLabel;
    private JTextArea resultArea;
    private double balance;

    public static void main(String[] args) {
        JFrame frame = new InvestmentFrame("Investment Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public InvestmentFrame(String title) {
        super(title);
        
        balance = INITIAL_BALANCE;
        resultLabel = new JLabel("Balance: $" + balance);
        resultArea = new JTextArea(10, 30);
        resultArea.setText(balance + "\n");
        resultArea.setEditable(false);

        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField() {
        rateLabel = new JLabel("Interest Rate:");
        final int FIELD_WIDTH = 10;
        rateField = new JTextField(FIELD_WIDTH);
        rateField.setText("" + DEFAULT_RATE);
    }

    class AddInterestListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String text = rateField.getText();
            double rate = Double.parseDouble(text); // default 5.0
            double interest = balance * rate / 100;
            balance += interest;
            // updating the JLabel to show the new balance
            resultLabel.setText("Balance: $" + balance);
            // appending the new balance to the JTextArea
            resultArea.append(balance + "\n");
        }
    }

    private void createButton() {
        button = new JButton("Add Interest");
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(rateLabel);
        panel.add(rateField);
        panel.add(button);
        panel.add(resultLabel);

        JScrollPane scrollPane = new JScrollPane(resultArea);
        panel.add(scrollPane);
        //panel.add(resultArea);

        add(panel);
    }
}
