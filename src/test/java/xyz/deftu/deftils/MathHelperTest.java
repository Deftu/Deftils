package xyz.deftu.deftils;

import org.junit.jupiter.api.Test;
import xyz.deftu.deftils.data.Vec3;

public class MathHelperTest {

    @Test
    public void randomization() {
        System.out.println("Integers:");
        System.out.println(MathHelper.getRandomInteger());
        System.out.println(MathHelper.getRandomInteger(10, 0));

        System.out.println();

        System.out.println("Floats:");
        System.out.println(MathHelper.getRandomFloat());
        System.out.println(MathHelper.getRandomFloat(10, 0));

        System.out.println();

        System.out.println("Doubles:");
        System.out.println(MathHelper.getRandomDouble());
        System.out.println(MathHelper.getRandomDouble(10, 0));

        System.out.println();

        System.out.println("Longs:");
        System.out.println(MathHelper.getRandomLong());
        System.out.println(MathHelper.getRandomLong(1000000000000000L, 0));

        System.out.println("\nDot product");
        System.out.println(MathHelper.dotProduct(new Vec3(0, 10, 20), new Vec3(10, 0, 20)));

        System.out.println("\nCross product");
        System.out.println(MathHelper.crossProduct(new Vec3(0, 10, 20), new Vec3(10, 0, 20)));

        System.out.println("\nRandom vector");
        System.out.println(MathHelper.randomiseVec3(1000, 0));
    }

}