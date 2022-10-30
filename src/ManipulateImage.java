import java.awt.*;
import java.awt.image.BufferedImage;


public class ManipulateImage {
    //TODO: Fix ArrayIndexOutOfBoundsException
    public static BufferedImage manipulate (BufferedImage imgb){
        BufferedImage imga = imgb;
        int width = imga.getWidth();
        int height = imga.getHeight();
        try {
            for (int hi = 0; hi < height; hi++) {
                for (int wi = 0; wi < width; wi++) {
                    int currentPixel = imga.getRGB(wi, hi);
                    System.out.println(currentPixel);
                    System.out.println((int)(currentPixel * Math.sin((double)wi)));
                    imga.setRGB(hi, wi, Color.BLUE.getRGB()/*(int) (currentPixel * Math.sin((double)wi))*/ );
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("\nCaught " + e);
        }
        return imga;
    }
}
