package xyz.deftu.deftils.fingerprints;

import xyz.deftu.deftils.Numbers;

import java.util.OptionalLong;
import java.util.concurrent.ThreadLocalRandom;

public class Fingerprints {

    public static long generateSimple() {
        return Numbers.getRandomLong(999999999999999L, 1)  & 0xfffffff;
    }

    public static long generate() {
        OptionalLong distinct = ThreadLocalRandom.current().longs().distinct().findFirst();
        if (!distinct.isPresent())
            return generateSimple();
        return distinct.getAsLong() & 0xfffffff;
    }

}