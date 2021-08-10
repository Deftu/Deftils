package xyz.matthewtgm.mango;

import lombok.Getter;
import xyz.matthewtgm.mango.data.Vec3;

import java.util.Random;

public class Numbers {

    @Getter private static final Random random = new Random();

    /**
     * Returns the distance between the two vectors.
     *
     * @param first The first vector.
     * @param second The second vector.
     * @param onlyHorizontal Whether to only calculate for the horizontal axis.
     * @return The distance between both vectors.
     */
    public static double getDistanceBetween(Vec3 first, Vec3 second, boolean onlyHorizontal) {
        int distance;
        int distanceX = first.getX() - second.getX();
        int distanceZ = first.getZ() - second.getZ();

        distance = distanceX * distanceX + distanceZ * distanceZ;
        if (!onlyHorizontal) {
            int distanceY = first.getY() - second.getY();
            distance += distanceY * distanceY;
        }

        return Math.sqrt(distance);
    }

    /**
     * Returns the distance between the two vectors.
     *
     * @param first The first vector.
     * @param second The second vector.
     * @return The distance between both vectors.
     */
    public static double getDistanceBetween(Vec3 first, Vec3 second) {
        return getDistanceBetween(first, second, false);
    }

    /**
     * @return A randomized number.
     */
    public static int getRandomInteger() {
        return random.nextInt();
    }

    /**
     * @param min The minimum number that can be returned.
     * @param max The maximum number that can be returned.
     * @return A number within the given range.
     */
    public static int getRandomInteger(int max, int min) {
        return random.nextInt(max - min) + min;
    }

    /**
     * @return A randomized number.
     */
    public static float getRandomFloat() {
        return random.nextFloat();
    }

    /**
     * @param max The minimum number that can be returned.
     * @param min The maximum number that can be returned.
     * @return A number within the given range.
     */
    public static float getRandomFloat(float max, float min) {
        return min + random.nextFloat() * (max - min);
    }

    /**
     * @return A randomized number.
     */
    public static double getRandomDouble() {
        return random.nextDouble();
    }

    /**
     * @param max The minimum number that can be returned.
     * @param min The maximum number that can be returned.
     * @return A number within the given range.
     */
    public static double getRandomDouble(double max, double min) {
        return min + random.nextDouble() * (max - min);
    }

    /**
     * @return A randomized number.
     */
    public static long getRandomLong() {
        return random.nextLong();
    }

    /**
     * @param max The minimum number that can be returned.
     * @param min The maximum number that can be returned.
     * @return A number within the given range.
     */
    public static long getRandomLong(long max, long min) {
        return min + random.nextLong() * (max - min);
    }

    /**
     * @param number The integer to check.
     * @return Whether the integer is positive.
     */
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    /**
     * @param number The integer to check.
     * @return Whether the integer is positive.
     */
    public static boolean isPositive(float number) {
        return number >= 0;
    }

    /**
     * @param number The integer to check.
     * @return Whether the integer is positive.
     */
    public static boolean isPositive(double number) {
        return number >= 0;
    }

    /**
     * @param number The integer to check.
     * @return Whether the integer is positive.
     */
    public static boolean isPositive(long number) {
        return number >= 0;
    }

    /**
     * @param number The integer to check.
     * @return Whether the integer is negative.
     */
    public static boolean isNegative(int number) {
        return number < 0;
    }

    /**
     * @param number The integer to check.
     * @return Whether the integer is negative.
     */
    public static boolean isNegative(float number) {
        return number < 0;
    }

    /**
     * @param number The integer to check.
     * @return Whether the integer is negative.
     */
    public static boolean isNegative(double number) {
        return number < 0;
    }

    /**
     * @param number The integer to check.
     * @return Whether the integer is negative.
     */
    public static boolean isNegative(long number) {
        return number < 0;
    }

}