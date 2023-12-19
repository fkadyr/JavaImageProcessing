import homework.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestImage {

    @Test
    public void testCheckFormatImage() throws IOException {
        String[] format = {"png", "jpg"};
        Main.convertingImageFormat(format);
        File path = new File(".");
        List<File> listFile = new ArrayList<>();

        listFile = Arrays.asList(path.listFiles());
        for (File file : listFile) {
            if (file.isFile()) {
                int lenStr = file.getName().length();
                String suffix = file.getName().substring(lenStr-3, lenStr);
                if (suffix.equals(format[0])) {
                    Assertions.fail("Формат не поменялся!!!");
                }
            }
        }
    }
}
