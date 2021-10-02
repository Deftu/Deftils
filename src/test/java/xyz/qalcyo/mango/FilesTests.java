package xyz.qalcyo.mango;

import org.junit.jupiter.api.Test;
import xyz.qalcyo.mango.error_handling.Result;

public class FilesTests {

    @Test
    public void test() {
        System.out.println("\nFilename extension test:");
        Result<String> fNameExt = Files.getFileExtension("Test.txt.png");
        if (fNameExt.success()) {
            System.out.println(fNameExt.value());
        }
    }

}
