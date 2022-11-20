import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;


public class ManipulateImage {
    public static BufferedImage customTone (BufferedImage img, float r, float g, float b){
        float[] color = new float[4];
        WritableRaster raster = img.getRaster();
        for (int x = 0, w = img.getWidth();x < w; ++x) {
            for (int y = 0, h = img.getHeight();y < h; ++y) {
                raster.getPixel(x, y, color);
                color[0] = color[0] * (r / 100);
                color[1] = color[1] * (g / 100);
                color[2] = color[2] * (b / 100);
                raster.setPixel(x, y, color);
            }
        }
        return img;
    }
}
