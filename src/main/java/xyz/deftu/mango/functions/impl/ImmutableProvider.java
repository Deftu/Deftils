package xyz.deftu.mango.functions.impl;

import xyz.deftu.mango.functions.abstraction.AbstractProvider;

public class ImmutableProvider<T> extends AbstractProvider<T> {

    public ImmutableProvider(T value) {
        super(value);
    }

    public AbstractProvider<T> set(T value) {
        throw new UnsupportedOperationException("Provider is immutable, cannot be modified.");
    }

    public static ImmutableProvider<?> empty() {
        return new ImmutableProvider<>(null);
    }

}