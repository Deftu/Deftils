package xyz.deftu.deftils;

import org.junit.jupiter.api.Test;

public class CollectionHelperTest {

    @Test
    public void arrayListMultiMap() {
        MultiMap<String, String> multiMap = new ArrayListMultiMap<>();
        System.out.println(multiMap);
        multiMap.put("Hello, ", "world");
        multiMap.put("Hello, ", "developers");
        System.out.println(multiMap);
    }

}