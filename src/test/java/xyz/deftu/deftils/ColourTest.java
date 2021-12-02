package xyz.deftu.deftils;

import org.junit.jupiter.api.Test;
import xyz.deftu.deftils.data.Colour;

public class ColourTest {

    @Test
    public void test() {
        Colour colour = Colour.BLACK;
        System.out.println(colour.getRed());
        System.out.println(colour.asColor());
        colour.setRed(100);
        System.out.println(colour.getRed());
        System.out.println(colour.asColor());
    }

}