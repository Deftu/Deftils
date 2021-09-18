package xyz.qalcyo.mango;

public class Colours {

    /**
     * @param colour The RGB colour to get from.
     * @return The alpha of the colour provided.
     */
    public static int alphaOf(int colour) {
        return (colour >> 24 & 255);
    }

}