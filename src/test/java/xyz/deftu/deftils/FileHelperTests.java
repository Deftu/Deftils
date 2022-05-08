package xyz.deftu.deftils;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;

public class FileHelperTests {

    @Test
    @Disabled
    public void fileExtensionOf_string() {
        try {
            String fileExtension = FileHelper.retrieveFileExtensionOf("Test.txt.png");
            System.out.println(fileExtension);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Disabled
    public void fileExtensionOf_file() {
        try {
            File file = new File("tests/text.txt");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }

            String fileExtension = FileHelper.retrieveFileExtensionOf(file);
            System.out.println(fileExtension);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Disabled
    public void ensureExists() {
        try {
            File file = new File("tests/text2.txt");
            System.out.println(file.exists());
            FileHelper.ensureFileExists(file);
            System.out.println(file.exists());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
