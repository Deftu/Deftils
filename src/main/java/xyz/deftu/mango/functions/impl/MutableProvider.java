package xyz.deftu.mango.functions.impl;

import xyz.deftu.mango.functions.abstraction.AbstractProvider;

public class MutableProvider<T> extends AbstractProvider<T> {

    public MutableProvider(T value) {
        super(value);
    }

    public MutableProvider() {
        this(null);
    }

    public static MutableProvider<?> empty() {
        return new MutableProvider<>();
    }

}