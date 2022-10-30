import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;


public class ManipulateImage {
    public static BufferedImage cutRed (BufferedImage img){
        float[] color = new float[4];
        WritableRaster raster = img.getRaster();
            for (int x = 0, w = img.getWidth();x < w; ++x) {
                for (int y = 0, h = img.getHeight();y < h; ++y) {
                    raster.getPixel(x, y, color);
                    color[0] = 0f;
                    raster.setPixel(x, y, color);
                }
            }
        return img;
    }

    public static BufferedImage cutGreen (BufferedImage img){
        float[] color = new float[4];
        WritableRaster raster = img.getRaster();
        for (int x = 0, w = img.getWidth();x < w; ++x) {
            for (int y = 0, h = img.getHeight();y < h; ++y) {
                raster.getPixel(x, y, color);
                color[1] = 0f;
                raster.setPixel(x, y, color);
            }
        }
        return img;
    }

    public static BufferedImage cutBlue (BufferedImage img){
        float[] color = new float[4];
        WritableRaster raster = img.getRaster();
        for (int x = 0, w = img.getWidth();x < w; ++x) {
            for (int y = 0, h = img.getHeight();y < h; ++y) {
                raster.getPixel(x, y, color);
                color[2] = 0f;
                raster.setPixel(x, y, color);
            }
        }
        return img;
    }
}
