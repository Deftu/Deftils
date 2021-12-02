package xyz.deftu.deftils.functions.impl;

import xyz.deftu.deftils.functions.abstraction.AbstractProvider;

public class MutableProvider<T> extends AbstractProvider<T> {

    public MutableProvider(T value) {
        super(value);
    }

    public MutableProvider() {
        this(null);
    }

}