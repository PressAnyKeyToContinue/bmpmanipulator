import java.awt.image.BufferedImage;

public class ManipulateImage {
    //TODO: Fix ArrayIndexOutOfBoundsException
    public static BufferedImage manipulate (BufferedImage img){
        int width = img.getWidth();
        int height = img.getHeight();

        for (int hi = 0; hi < height; hi++)
        {
            for (int wi = 0; wi < width; wi++)
            {
                int currentPixel = img.getRGB(wi, hi);
                System.out.println(currentPixel);
                img.setRGB(hi, wi,(currentPixel * 2));
            }
        }
        return img;
    }
}
