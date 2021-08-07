package xyz.matthewtgm.mango;

import xyz.matthewtgm.mango.writers.StringBuilderWriter;

import java.io.*;
import java.nio.charset.Charset;

public class IO {

    private static final int EOF = -1;
    private static final int DEFAULT_BUFFER_SIZE = 1024 * 4;

    /**
     * Converts an {@link InputStream} to a {@link String}
     *
     * @param input The {@link InputStream} to convert.
     * @return The converted string.
     * @throws IOException
     */
    public static String toString(InputStream input) throws IOException {
        return toString(input, Charset.defaultCharset());
    }

    /**
     * Converts an {@link InputStream} to a {@link String}
     *
     * @param input The {@link InputStream} to convert.
     * @param encoding The encoding of the {@link InputStream} content.
     * @return The converted string.
     * @throws IOException
     */
    public static String toString(InputStream input, Charset encoding) throws IOException {
        StringBuilderWriter sw = new StringBuilderWriter();
        copy(input, sw, encoding);
        return sw.toString();
    }

    private static void copy(InputStream input, Writer output, Charset encoding) throws IOException {
        InputStreamReader in = new InputStreamReader(input, encoding);
        copy(in, output);
    }

    private static int copy(Reader input, Writer output) throws IOException {
        long count = copyLarge(input, output);
        if (count > Integer.MAX_VALUE)
            return -1;
        return (int) count;
    }

    private static long copyLarge(Reader input, Writer output) throws IOException {
        return copyLarge(input, output, new char[DEFAULT_BUFFER_SIZE]);
    }

    private static long copyLarge(Reader input, Writer output, char [] buffer) throws IOException {
        long count = 0;
        int n;
        while (EOF != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
            count += n;
        }
        return count;
    }

}