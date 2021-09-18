package xyz.qalcyo.mango;

import org.junit.jupiter.api.Test;

public class ClassesTest {

    @Test
    public void testClassName() {
        System.out.println(Classes.callerClassName());
    }

    @Test
    public void testClassSimpleName() {
        System.out.println(Classes.callerClassSimpleName());
    }

}