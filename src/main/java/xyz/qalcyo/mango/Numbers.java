package xyz.qalcyo.mango;

import xyz.qalcyo.mango.collections.impl.MutableTriplet;
import xyz.qalcyo.mango.data.Vec3;

import java.util.Random;

public class Numbers {

    private static final Random random = new Random();

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
     * Calculates the dot product between two vectors
     * @param first The first vector
     * @param second The second vector
     * @return The (scalar) dot product of both vectors
     */
    public static int dotProduct(Vec3 first, Vec3 second) {
        return (first.getX() * second.getX()) + (first.getY() * second.getY()) + (first.getZ() * second.getZ());
    }

    /**
     * Calculates the cross product between two vectors
     * @param first The first vector
     * @param second The second vector
     * @return The cross product of both vectors
     */
    public static Vec3 crossProduct(Vec3 first, Vec3 second) {
        int cx = (first.getY() * second.getZ()) - (first.getZ() * second.getY());
        int cy = (first.getZ() * second.getX()) - (first.getX() * second.getZ());
        int cz = (first.getX() * second.getY()) - (first.getY() * second.getX());
        return new Vec3(cx, cy, cz);
    }

    /**
     * Normalises a signed vector between 0 & 1
     * https://www.khronos.org/opengl/wiki/Normalized_Integer
     * @param x The vector
     * @return The normalised vector as a triplet
     */
    public static MutableTriplet<Float, Float, Float> crossProduct(Vec3 x) {
        float xn = normaliseInteger(x.getX());
        float yn = normaliseInteger(x.getY());
        float zn = normaliseInteger(x.getZ());
        return new MutableTriplet<>(xn, yn, zn);
    }

    /**
     * Normalises a signed integer between 0 & 1
     * https://www.khronos.org/opengl/wiki/Normalized_Integer
     * @param x The integer to normalise
     * @return The normalised integer
     */
    public static float normaliseInteger(int x) {
        return (float) Math.max((float)x / (float)Integer.MAX_VALUE, -1.0);
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

    public static Random getRandom() {
        return random;
    }

}
