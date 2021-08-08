package xyz.matthewtgm.mango;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.matthewtgm.mango.collections.Pair;
import xyz.matthewtgm.mango.collections.impl.ImmutablePair;
import xyz.matthewtgm.mango.collections.impl.MutablePair;

public class PairTest {

    @Test
    @DisplayName("Tests of MutablePairs")
    public void mutable(){
        Pair<String, String> stringPair = new MutablePair<>();
        System.out.println(stringPair.left() + " | " + stringPair.right());
        stringPair.first("mutable");
        System.out.println(stringPair.key() + " | " + stringPair.value());
        stringPair.value("also mutable");
        System.out.println(stringPair.first() + " | " + stringPair.second());
    }

    @Test
    @DisplayName("Tests of ImmutablePairs")
    public void immutable() {
        Pair<String, String> stringPair = new ImmutablePair<>("immutable", "also immutable");
        System.out.println(stringPair.left() + " | " + stringPair.right());
    }

}