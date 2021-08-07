package xyz.matthewtgm.mango.collections.util;

import xyz.matthewtgm.mango.collections.impl.ImmutablePair;
import xyz.matthewtgm.mango.collections.impl.MutablePair;

public class Pairs {

    public static <L, R> MutablePair<L, R> newMutablePair() {
        return new MutablePair<>();
    }

    public static <L, R> ImmutablePair<L, R> newImmutablePair(L left, R right) {
        return new ImmutablePair<>(left, right);
    }

}