package S04_frame_gui;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class FaceComponent extends JComponent {
    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Draw face outline
        Ellipse2D.Double face = new Ellipse2D.Double(10, 10, 200, 200);
        g2.setColor(Color.YELLOW);
        g2.fill(face);
        g2.setColor(Color.BLACK);
        g2.draw(face);

        // Draw eyes
        Ellipse2D.Double leftEye = new Ellipse2D.Double(55, 65, 30, 30);
        Ellipse2D.Double rightEye = new Ellipse2D.Double(135, 65, 30, 30);
        g2.setColor(Color.WHITE);
        g2.fill(leftEye);
        g2.fill(rightEye);
        g2.setColor(Color.BLACK);
        g2.draw(leftEye);
        g2.draw(rightEye);

        // Draw pupils
        Ellipse2D.Double leftPupil = new Ellipse2D.Double(65, 75, 10, 10);
        Ellipse2D.Double rightPupil = new Ellipse2D.Double(145, 75, 10, 10);
        g2.fill(leftPupil);
        g2.fill(rightPupil);

        // Draw mouth
        Line2D.Double mouth = new Line2D.Double(70, 150, 150, 150);
        g2.draw(mouth);

        // Draw nose
        Line2D.Double nose = new Line2D.Double(100, 100, 100, 130);
        g2.draw(nose);

        // Draw eyebrows
        Line2D.Double leftBrow = new Line2D.Double(50, 50, 85, 40);
        Line2D.Double rightBrow = new Line2D.Double(135, 40, 170, 50);
        g2.draw(leftBrow);
        g2.draw(rightBrow); 

        // Draw hat
        Rectangle hatBase = new Rectangle(40, 10, 130, 30);
        g2.setColor(Color.RED);
        g2.fill(hatBase);
        g2.setColor(Color.BLACK);
        g2.draw(hatBase);
        Ellipse2D.Double hatTop = new Ellipse2D.Double(25, -
20, 160, 50);
        g2.setColor(Color.RED);
        g2.fill(hatTop);
        g2.setColor(Color.BLACK);
        g2.draw(hatTop);    

        // Draw greetings
        g2.setColor(Color.BLUE);
        g2.drawString("Hello, World!", 90, 230);
    }
    
}
