package xyz.qalcyo.mango;

import org.junit.jupiter.api.Test;
import xyz.qalcyo.mango.collections.MultiMap;
import xyz.qalcyo.mango.collections.impl.ArrayListMultiMap;

public class MapsTest {

    @Test
    public void arrayListMultiMap() {
        MultiMap<String, String> multiMap = new ArrayListMultiMap<>();
        System.out.println(multiMap);
        multiMap.put("Hello, ", "world");
        multiMap.put("Hello, ", "developers");
        System.out.println(multiMap);
    }

}