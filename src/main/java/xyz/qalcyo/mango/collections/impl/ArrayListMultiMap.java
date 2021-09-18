package xyz.qalcyo.mango.collections.impl;

import xyz.qalcyo.mango.annotations.Beta;
import xyz.qalcyo.mango.collections.abstraction.AbstractMultiMap;

import java.util.ArrayList;

@Beta
public class ArrayListMultiMap<K, V> extends AbstractMultiMap<K, V> {

    public ArrayListMultiMap() {
        super(ArrayList.class);
    }

}