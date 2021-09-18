package xyz.qalcyo.mango.localization;

import java.io.IOException;
import java.io.InputStream;

public class Localization {
    private Locale locale;
    public String format(String input, String... keys) {
        return locale.translate(input, keys);
    }
    public Locale getLocale() {
        return locale;
    }
    public Localization setLocale(InputStream stream) throws IOException {
        locale = new Locale().load(stream);
        return this;
    }
}