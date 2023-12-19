package homework;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        String[] format = {"png", "jpg"};
        convertingImageFormat(format);
    }

    public static void convertingImageFormat(String[] format) throws IOException {
        File path = new File(".");
        List<File> listFile = new ArrayList<>();

        listFile = Arrays.asList(path.listFiles());
        for (File file : listFile) {
            if (file.isFile()) {
                if (file.getName().endsWith("." + format[0])) {
                    BufferedImage img = ImageIO.read(file);
                    drawSquareWithText(img);
                    String fileName = file.getName().substring(0, file.getName().length() - 3) + format[1];
                    ImageIO.write(img, format[1], new File(fileName));
                    file.delete();
                }
            }
        }
    }

    public static void drawSquareWithText(BufferedImage image) {
        Graphics2D g = image.createGraphics();
        g.setColor(Color.CYAN);
        int w = 200;
        g.drawRect((image.getWidth() / 2) - (w / 2),(image.getHeight() / 2) - (w / 2), w, w);
        g.drawString("Hello,", (image.getWidth() / 2) - 25, (image.getHeight() / 2) - 15);
        g.drawString("World!", (image.getWidth() / 2) - 25, (image.getHeight() / 2) + 15);
        g.dispose();
    }
}
