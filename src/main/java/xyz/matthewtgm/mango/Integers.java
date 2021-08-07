package xyz.matthewtgm.mango;

import lombok.Getter;

import java.util.Random;

public class Integers {

    @Getter private static final Random random = new Random();

    /**
     * @return A completely randomized number.
     */
    public static int getRandomNumber() {
        return random.nextInt();
    }

    /**
     * @param min The minimum number that can be returned.
     * @param max The maximum number that can be returned.
     * @return A number within the given range.
     */
    public static int getRandomNumber(int max, int min) {
        return random.nextInt(max - min) + min;
    }

    /**
     * @param integer The integer to check.
     * @return Whether or not the integer is positive.
     */
    public static boolean isPositive(int integer) {
        return integer >= 0;
    }

    /**
     * @param integer The integer to check.
     * @return Whether or not the integer is negative.
     */
    public static boolean isNegative(int integer) {
        return integer < 0;
    }

}