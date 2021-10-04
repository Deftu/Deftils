package xyz.qalcyo.mango.collections.util;

import xyz.qalcyo.mango.collections.impl.ImmutableTriplet;
import xyz.qalcyo.mango.collections.impl.MutableTriplet;

public class Triplets {

    public static <X, Y, Z> MutableTriplet<X, Y, Z> newMutableTriplet() {
        return new MutableTriplet<>();
    }

    public static <X, Y, Z> ImmutableTriplet<X, Y, Z> newImmutableTriplet(X first, Y second, Z third) {
        return new ImmutableTriplet<>(first, second, third);
    }

}
