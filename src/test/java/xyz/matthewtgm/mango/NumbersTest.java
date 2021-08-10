package xyz.matthewtgm.mango;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumbersTest {

    @Test
    @DisplayName("Randomization test")
    public void randomization() {
        System.out.println("Integers:");
        System.out.println(Numbers.isPositive(10));
        System.out.println(Numbers.getRandomInteger());
        System.out.println(Numbers.getRandomInteger(10, 0));

        System.out.println();

        System.out.println("Floats:");
        System.out.println(Numbers.isPositive(10f));
        System.out.println(Numbers.getRandomFloat());
        System.out.println(Numbers.getRandomFloat(10, 0));

        System.out.println();

        System.out.println("Doubles:");
        System.out.println(Numbers.isPositive(10D));
        System.out.println(Numbers.getRandomDouble());
        System.out.println(Numbers.getRandomDouble(10, 0));

        System.out.println();

        System.out.println("Longs:");
        System.out.println(Numbers.isPositive(1000000000000000L));
        System.out.println(Numbers.getRandomLong());
        System.out.println(Numbers.getRandomLong(1000000000000000L, 0));
    }

}