package Example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {

        BufferedImage img = ImageIO.read(new File("img.png"));
        //BufferedImage img = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {
                img.setRGB(x, y, Color.GREEN.getRGB());
            }
        }

        ImageIO.write(img, "png", new File("img.png"));
    }
}
