import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;



public class DrawImage {
    public static void main(String[] avg) {
        String path = "sample.bmp";
        BufferedImage img1 = GetImage.image(path);
        BufferedImage img2 = ManipulateImage.cutRed(GetImage.image(path));
        BufferedImage img3 = ManipulateImage.cutGreen(GetImage.image(path));
        BufferedImage img4 = ManipulateImage.cutRed(ManipulateImage.cutBlue(GetImage.image(path)));
        BufferedImage[] imgs = {img1, img2, img3, img4};
        for (int i = 0; i < imgs.length; ++i){
            SaveImage.writeBMP(imgs[i], "out" + i + ".bmp");
        }
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
