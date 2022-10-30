import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class DrawImage {
    public static GetImage imageLoader = new GetImage();
    public static ManipulateImage manipulator = new ManipulateImage();
    public static void main(String[] avg) throws IOException
    {
        //C:\Users\macek\IdeaProjects\bmpeditor\sprites\sample.bmp
        BufferedImage img = imageLoader.image("sample.bmp");

        DrawImage before = new DrawImage(img, "Before");
        DrawImage di = new DrawImage(manipulator.manipulate(img), "After");
    }
    public DrawImage(BufferedImage img, String label) throws IOException
    {
        ImageIcon icon = new ImageIcon(img);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(1800, 1000);
        JLabel lbl = new JLabel();
        lbl.setIcon(icon);
        lbl.setText(label);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
