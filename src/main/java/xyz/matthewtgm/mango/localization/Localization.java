package xyz.matthewtgm.mango.localization;

import java.io.IOException;
import java.io.InputStream;

public class Localization {

    private static Locale locale;

    public static String format(String input, String... keys) {
        return locale.translate(input, keys);
    }

    public static Locale getLocale() {
        return locale;
    }

    public static void setLocale(InputStream stream) throws IOException {
        Localization.locale = new Locale();
        Localization.locale.load(stream);
    }

}