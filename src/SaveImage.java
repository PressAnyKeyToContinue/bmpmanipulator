import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SaveImage {
    public static void writeBMP(BufferedImage img, String filename){
        try{
            ImageIO.write(img, "bmp", new File(filename));
        }catch (IOException e){
            System.out.println("Exception " + e);
        }
    }
}
