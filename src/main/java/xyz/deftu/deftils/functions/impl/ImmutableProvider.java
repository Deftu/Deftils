package xyz.deftu.deftils.functions.impl;

import xyz.deftu.deftils.functions.abstraction.AbstractProvider;

public class ImmutableProvider<T> extends AbstractProvider<T> {

    public ImmutableProvider(T value) {
        super(value);
    }

    public AbstractProvider<T> set(T value) {
        throw new UnsupportedOperationException("Provider is immutable, cannot be modified.");
    }

}