package xyz.deftu.deftils;

import org.junit.jupiter.api.Test;

public class APIsTest {

    @Test
    public void testPost() {
        System.out.println(APIs.post("", "hello, world!",
                new APIs.HttpHeader("User-Agent", "Mango/1.3.0"),
                new APIs.HttpHeader("Pragma", "no-cache"),
                new APIs.HttpHeader("Cache-Control", "no-cache"),
                new APIs.HttpHeader("Content-Type", "application/json")));
    }

}