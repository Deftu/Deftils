package xyz.qalcyo.mango;

import org.junit.jupiter.api.Test;
import xyz.qalcyo.mango.exceptions.handling.Result;

import java.io.File;

public class FilesTests {

    @Test
    public void fileExtensionOf_string() {
        String fileExtension = Files.fileExtensionOf("Test.txt.png");
        System.out.println(fileExtension);
    }

    @Test
    public void fileExtensionOf_file() throws Exception {
        File file = new File("tests/text.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        String fileExtension = Files.fileExtensionOf(file);
        System.out.println(fileExtension);
    }

    @Test
    public void ensureExists() {
        File file = new File("tests/text2.txt");
        System.out.println(file.exists());
        Files.ensureFileExists(file);
        System.out.println(file.exists());
    }

}
