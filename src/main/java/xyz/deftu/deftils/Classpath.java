package xyz.deftu.deftils;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Classpath {

    /**
     * Adds a jar's source to the current classpath.
     *
     * @param classLoader The classloader to add the jar with (MUST be a URLClassLoader)
     * @param file The file to add from.
     * @return The state code.
     */
    public static int inject(ClassLoader classLoader, File file) {
        if (classLoader instanceof URLClassLoader) {
            URLClassLoader urlClassLoader = (URLClassLoader) classLoader;
            try {
                Method method = urlClassLoader.getClass().getMethod("addURL", URL.class);
                method.invoke(urlClassLoader, file.toURI().toURL());
                return -1;
            } catch (Exception e) {
                e.printStackTrace();
                return 1;
            }
        } else {
            return 0;
        }
    }

    /**
     * Adds a jar's source to the current classpath.
     *
     * @param file The file to add from.
     * @return The state code.
     */
    public static int inject(File file) {
        return inject(Classpath.class.getClassLoader(), file);
    }

}