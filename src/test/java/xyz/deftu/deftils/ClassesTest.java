package xyz.deftu.deftils;

import org.junit.jupiter.api.Test;

public class ClassesTest {

    @Test
    public void testClassName() {
        System.out.println(Classes.retrieveCallerClassName());
    }

    @Test
    public void testClassSimpleName() {
        System.out.println(Classes.retrieveCallerClassSimpleName());
    }

}