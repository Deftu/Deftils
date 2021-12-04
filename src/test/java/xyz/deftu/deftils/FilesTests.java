package xyz.deftu.deftils;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;

public class FilesTests {

    @Test
    @Disabled
    public void fileExtensionOf_string() {
        String fileExtension = Files.retrieveFileExtensionOf("Test.txt.png");
        System.out.println(fileExtension);
    }

    @Test
    @Disabled
    public void fileExtensionOf_file() {
        File file = new File("tests/text.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }

        String fileExtension = Files.retrieveFileExtensionOf(file);
        System.out.println(fileExtension);
    }

    @Test
    @Disabled
    public void ensureExists() {
        File file = new File("tests/text2.txt");
        System.out.println(file.exists());
        Files.ensureFileExists(file);
        System.out.println(file.exists());
    }

}
