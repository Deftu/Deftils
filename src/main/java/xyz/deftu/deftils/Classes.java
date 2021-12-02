package xyz.deftu.deftils;

public class Classes {

    public static String callerClassName() {
        StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stElements) {
            if (!element.getClassName().equals(Classes.class.getName()) && element.getClassName().indexOf("java.lang.Thread") != 0) {
                return element.getClassName();
            }
        }
        return null;
    }

    public static String callerClassSimpleName() {
        StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stElements) {
            if (!element.getClassName().equals(Classes.class.getName()) && element.getClassName().indexOf("java.lang.Thread") != 0) {
                String className = element.getClassName();
                return className.substring(className.lastIndexOf(".") + 1);
            }
        }
        return null;
    }

}