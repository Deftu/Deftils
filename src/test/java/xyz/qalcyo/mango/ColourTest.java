package xyz.qalcyo.mango;

import org.junit.jupiter.api.Test;
import xyz.qalcyo.mango.data.Colour;

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