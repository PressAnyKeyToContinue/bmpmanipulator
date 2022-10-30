import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class DrawImage {
    public static void main(String[] avg) {
        BufferedImage[] imgs = {GetImage.image("sample.bmp"), ManipulateImage.cutRed(GetImage.image("sample.bmp")), ManipulateImage.cutGreen(GetImage.image("sample.bmp")), ManipulateImage.cutBlue(GetImage.image("sample.bmp"))};
        DrawImage window = new DrawImage(imgs);
    }
    public DrawImage(BufferedImage[] imgs) {
        JFrame frame = new JFrame();
        GridLayout multiLayout = new GridLayout(1, 1);
        frame.setLayout(multiLayout);
        for (int i = 0; i < imgs.length; ++i)
        {
            frame.add(new JLabel(new ImageIcon(imgs[i])));
        }
        frame.setSize(1800, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
