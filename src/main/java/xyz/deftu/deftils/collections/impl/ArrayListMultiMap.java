package xyz.deftu.deftils.collections.impl;

import xyz.deftu.deftils.annotations.Beta;
import xyz.deftu.deftils.collections.abstraction.AbstractMultiMap;

import java.util.ArrayList;

@Beta
public class ArrayListMultiMap<K, V> extends AbstractMultiMap<K, V> {

    public ArrayListMultiMap() {
        super(ArrayList.class);
    }

}