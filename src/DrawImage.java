import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class DrawImage {
    public static GetImage imageLoader = new GetImage();
    public static void main(String[] avg) throws IOException
    {
        //C:\Users\macek\IdeaProjects\bmpeditor\sprites\sample.bmp
        DrawImage di = new DrawImage(imageLoader.image("sample.bmp"));
    }
    public DrawImage(BufferedImage img) throws IOException
    {
        ImageIcon icon = new ImageIcon(img);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(1800, 1000);
        JLabel lbl = new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
