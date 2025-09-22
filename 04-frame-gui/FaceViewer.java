import javax.swing.JFrame;

public class FaceViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Face Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FaceComponent comFace = new FaceComponent();
        frame.add(comFace);

        frame.setVisible(true);
    }
}
