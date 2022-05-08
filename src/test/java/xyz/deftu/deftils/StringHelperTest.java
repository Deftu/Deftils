package xyz.deftu.deftils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringHelperTest {
    @Test
    @DisplayName("Contains ignore-case test")
    public void containsIgnoreCase() {
        String hello = "HeLlO!!";
        String helCheck = "hel";
        System.out.println(StringHelper.containsIgnoreCase(hello, helCheck));

        String str = "StRiNg!";
        String strCheck = "hi";
        System.out.println(StringHelper.containsIgnoreCase(str, strCheck));
    }

    @Test
    @DisplayName("Capitalization test")
    public void capitalize() {
        String text = "hello, today we are going to...";
        System.out.println(text);
        System.out.println(StringHelper.capitalize(text));
    }
}