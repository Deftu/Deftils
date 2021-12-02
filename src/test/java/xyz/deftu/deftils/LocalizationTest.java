package xyz.deftu.deftils;

import org.junit.jupiter.api.Test;
import xyz.deftu.deftils.localization.Localization;

public class LocalizationTest {

    @Test
    public void loading() throws Exception {
        Localization localization = new Localization();
        localization.setLocale(ClassLoader.getSystemClassLoader().getResourceAsStream("en_US.lang"));
        System.out.println("Hello, " + localization.format("epic.gaming"));
    }

}