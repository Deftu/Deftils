package xyz.matthewtgm.mango;

import org.junit.jupiter.api.Test;
import xyz.matthewtgm.mango.localization.Localization;

public class LocalizationTest {

    @Test
    public void loading() throws Exception {
        Localization.setLocale(ClassLoader.getSystemClassLoader().getResourceAsStream("en_US.lang"));

        System.out.println("Hello, " + Localization.format("epic.gaming"));
    }

}