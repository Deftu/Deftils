package xyz.matthewtgm.mango;

import java.awt.*;

public class Colours {

    /**
     * @param colour The RGB colour to get from.
     * @return The alpha of the colour provided.
     */
    public static int alphaOf(int colour) {
        return (colour >> 24 & 255);
    }

    /**
     * Creates a {@link Color} instance using the RGB value provided.
     *
     * @param rgb The RGB colour.
     * @return The created {@link Color}.
     */
    public static Color create(int rgb) {
        return new Color(rgb);
    }

    /**
     * Creates a {@link Color} from the RGB values provided.
     *
     * @param red The red value of the colour.
     * @param green The green value of the colour.
     * @param blue The blue of the colour.
     * @return The created {@link Color}.
     */
    public static Color create(int red, int green, int blue) {
        return new Color(red, green, blue);
    }

    /**
     * Creates a {@link Color} from the RGBA values provided.
     *
     * @param red The red value of the colour.
     * @param green The green value of the colour.
     * @param blue The blue value of the colour.
     * @param alpha The alpha value of the colour.
     * @return The created {@link Color}.
     */
    public static Color create(int red, int green, int blue, int alpha) {
        return new Color(red, green, blue, alpha);
    }

}