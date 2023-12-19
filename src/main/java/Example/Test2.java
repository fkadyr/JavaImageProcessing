package Example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Test2 {
    public static void main(String[] args) throws Exception {
        //BufferedImage img2 = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
        BufferedImage img2 = ImageIO.read(new File("img2.png"));
        Graphics2D graphics2D = img2.createGraphics();

        int w = 200, h = 200 ;

        graphics2D.setColor(Color.WHITE);

        //graphics2D.fillRect((img2.getWidth() - w) / 2, (img2.getHeight() - h) / 2, w, h);
        //graphics2D.drawOval(0,0, img2.getWidth(), img2.getHeight());
        //graphics2D.drawString("Draw something", 50, 50);

        graphics2D.dispose();
        ImageIO.write(img2, "jpg", new File("img2.jpg"));

    }
}
