package xyz.deftu.deftils;

import org.junit.jupiter.api.Test;
import xyz.deftu.deftils.collections.Pair;
import xyz.deftu.deftils.collections.impl.ImmutablePair;
import xyz.deftu.deftils.collections.impl.MutablePair;

public class PairTest {

    @Test
    public void mutable() {
        Pair<String, String> stringPair = new MutablePair<>();
        System.out.println(stringPair.left() + " | " + stringPair.right());
        stringPair.first("mutable");
        System.out.println(stringPair.key() + " | " + stringPair.value());
        stringPair.value("also mutable");
        System.out.println(stringPair.first() + " | " + stringPair.second());
    }

    @Test
    public void immutable() {
        Pair<String, String> stringPair = new ImmutablePair<>("immutable", "also immutable");
        System.out.println(stringPair.left() + " | " + stringPair.right());
    }

    @Test
    public void mutableOf() {
        Pair<String, String> stringPair = Pair.of("Hi!", "Hello!");
        System.out.println(stringPair.left() + " | " + stringPair.right());
        stringPair.first("mutable");
        System.out.println(stringPair.key() + " | " + stringPair.value());
        stringPair.value("also mutable");
        System.out.println(stringPair.first() + " | " + stringPair.second());

        System.out.println(stringPair.asEntry());
    }

    @Test
    public void immutableOf() {

    }

}