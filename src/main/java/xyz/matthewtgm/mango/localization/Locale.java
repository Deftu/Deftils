package xyz.matthewtgm.mango.localization;

import xyz.matthewtgm.mango.IO;
import xyz.matthewtgm.mango.Lists;
import xyz.matthewtgm.mango.Maps;
import xyz.matthewtgm.mango.Objects;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class Locale {

    private final Map<String, String> translations = Maps.newHashMap();

    public void load(InputStream stream) throws IOException {
        Objects.notNull(stream, "Input");

        for (String line : IO.readLines(stream, StandardCharsets.UTF_8)) {
            if (!line.isEmpty() && line.charAt(0) != '#') {
                String[] split = line.trim().split("=");
                if (split.length < 1)
                    continue;
                translations.put(split[0], split[1]);
            }
        }
    }

    private String translate(String input) {
        String translation = translations.get(input);
        return translation == null ? input : translation;
    }

    public String translate(String input, String... keys) {
        String translated = translate(input);

        try {
            return String.format(translated, (Object[]) keys);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return translated;
    }

}