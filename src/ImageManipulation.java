/*
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;
import marvin.plugin.MarvinImagePlugin;
import marvin.util.MarvinPluginLoader;
import

import javax.swing.*;
import java.awt.*;

public class ImageManipulation extends JFrame {
    MarvinImagePlugin prewitt = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.edge.prewitt");
    MarvinImagePlugin errorDiffusion = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.halftone.errorDiffusion");
    MarvinImagePlugin emboss = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.color.emboss");

    public ImageManipulation()
    {
       super("ImageManipulation");

       setLayout(new GridLayout(2,2));

       MarvinImage img1 = MarvinImageIO.loadImage("sample.bmp");
       MarvinImage img2 = new MarvinImage(img1.getWidth(), img1.getHeight());
       MarvinImage img3 = new MarvinImage(img1.getWidth(), img1.getHeight());
       MarvinImage img4 = new MarvinImage(img1.getWidth(), img1.getHeight());

       errorDiffusion.process(img1, img2);
       prewitt.process(img1, img3);
       emboss.process(img1, img4);

       addPanel(img1);
       addPanel(img2);
       addPanel(img3);
       addPanel(img4);
    }
}
 */
