package xyz.deftu.deftils;

import org.junit.jupiter.api.Test;
import xyz.deftu.deftils.fingerprints.Fingerprints;

public class FingerprintTest {

    @Test
    public void test() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Fingerprints.generate());
        }
    }

}