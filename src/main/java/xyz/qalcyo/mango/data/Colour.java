package xyz.qalcyo.mango.data;

import java.awt.*;

public class Colour {

    /* Constants. */
    public static final Colour WHITE = of(Color.WHITE);
    public static final Colour LIGHT_GRAY = of(Color.LIGHT_GRAY);
    public static final Colour GRAY = of(Color.GRAY);
    public static final Colour DARK_GRAY = of(Color.DARK_GRAY);
    public static final Colour BLACK = of(Color.BLACK);
    public static final Colour RED = of(Color.RED);
    public static final Colour PINK = of(Color.PINK);
    public static final Colour ORANGE = of(Color.ORANGE);
    public static final Colour YELLOW = of(Color.YELLOW);
    public static final Colour GREEN = of(Color.GREEN);
    public static final Colour MAGENTA = of(Color.MAGENTA);
    public static final Colour CYAN = of(Color.CYAN);
    public static final Colour BLUE = of(Color.BLUE);

    /* Class. */

    private Color color;
    private int red, green, blue, alpha;

    public Colour(int red, int green, int blue, int alpha) {
        this.red = ensureCorrect("Red", red);
        this.green = ensureCorrect("Green", green);
        this.blue = ensureCorrect("Blue", blue);
        this.alpha = ensureCorrect("Alpha", alpha);

        this.color = new Color(red, green, blue, alpha);
    }

    public Colour(int red, int green, int blue) {
        this(red, green, blue, 255);
    }

    public Colour(Color color) {
        this(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public Colour copy() {
        return new Colour(color);
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = update(ensureCorrect("Red", red), red, green, blue, alpha);
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = update(ensureCorrect("Green", green), red, green, blue, alpha);
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = update(ensureCorrect("Blue", blue), red, green, blue, alpha);
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = update(ensureCorrect("Alpha", alpha), red, green, blue, alpha);
    }

    public int getRGB() {
        return color.getRGB();
    }

    public Color asColor() {
        return color;
    }

    private int ensureCorrect(String name, int value) {
        if (value > 255) {
            throw new IllegalArgumentException(name + " cannot be more than 255.");
        }

        return value;
    }

    private int update(int value, int red, int green, int blue, int alpha) {
        this.color = new Color(red, green, blue, alpha);
        return value;
    }

    /* Statics. */

    public static Colour of(int red, int green, int blue, int alpha) {
        return new Colour(red, green, blue, alpha);
    }

    public static Colour of(int red, int green, int blue) {
        return new Colour(red, green, blue);
    }

    public static Colour of(Color color) {
        return new Colour(color);
    }

}