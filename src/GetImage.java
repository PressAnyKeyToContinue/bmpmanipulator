import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GetImage {
    public static BufferedImage image (String filepath){
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File(filepath));
        }catch (IOException e){
            System.out.println("Exception" + e);
        }
        return img;
    }
}
