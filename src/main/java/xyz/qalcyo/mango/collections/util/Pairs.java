package xyz.qalcyo.mango.collections.util;

import xyz.qalcyo.mango.collections.impl.MutablePair;
import xyz.qalcyo.mango.collections.impl.ImmutablePair;

public class Pairs {

    public static <L, R> MutablePair<L, R> newMutablePair() {
        return new MutablePair<>();
    }

    public static <L, R> ImmutablePair<L, R> newImmutablePair(L left, R right) {
        return new ImmutablePair<>(left, right);
    }

}