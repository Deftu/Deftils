package xyz.qalcyo.mango;

import xyz.qalcyo.mango.writers.StringBuilderWriter;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

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

    /**
     * Closes the input stream provided.
     *
     * @param inputStream The input stream to close.
     */
    public static void closeQuietly(InputStream inputStream) {
        closeQuietly((Closeable) inputStream);
    }

    /**
     * Closes the output stream provided.
     *
     * @param outputStream The output stream to close.
     */
    public static void closeQuietly(OutputStream outputStream) {
        closeQuietly((Closeable) outputStream);
    }

    /**
     * Closes a {@link Closeable}.
     *
     * @param closeable The closeable to close.
     */
    public static void closeQuietly(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Converts an input stream to a byte array.
     *
     * @param inputStream The input stream to convert.
     * @return The converted array.
     * @throws IOException Thrown if there's an issue while copying from the input to the output.
     */
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /**
     * Reads all lines from an input stream.
     *
     * @param inputStream The input stream to read from.
     * @param encoding The encoding of this input stream's content.
     * @return The read lines.
     * @throws IOException If there was an issue reading a line.
     */
    public static List<String> readLines(InputStream inputStream, Charset encoding) throws IOException {
        InputStreamReader reader = new InputStreamReader(inputStream, encoding);
        return readLines(reader);
    }

    /**
     * Reads all lines from an input stream.
     *
     * @param inputStream The input stream to read from.
     * @param encoding The encoding of this input stream's content.
     * @return The read lines.
     * @throws IOException If there was an issue reading a line.
     */
    public static List<String> readLines(InputStream inputStream, String encoding) throws IOException {
        return readLines(inputStream, Charset.forName(encoding));
    }

    /**
     * Reads all lines from the given reader.
     *
     * @param reader The reader to read from.
     * @return The read lines.
     * @throws IOException If there was an issue reading a line.
     */
    public static List<String> readLines(Reader reader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        List<String> value = new ArrayList<>();

        String current = bufferedReader.readLine();
        while (current != null) {
            value.add(current);
            current = bufferedReader.readLine();
        }

        return value;
    }

    private static void copy(InputStream input, Writer output, Charset encoding) throws IOException {
        InputStreamReader in = new InputStreamReader(input, encoding);
        copy(in, output);
    }

    private static int copy(InputStream inputStream, OutputStream output) throws IOException {
        long count = copyLarge(inputStream, output);
        if (count > Integer.MAX_VALUE)
            return -1;
        return (int) count;
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

    private static long copyLarge(InputStream inputStream, OutputStream output) throws IOException {
        return copyLarge(inputStream, output, new byte[4096]);
    }

    private static long copyLarge(InputStream input, OutputStream output, byte[] buffer) throws IOException {
        long count = 0;
        int n = 0;
        while (EOF != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
            count += n;
        }
        return count;
    }

    private static long copyLarge(Reader input, Writer output, char[] buffer) throws IOException {
        long count = 0;
        int n;
        while (EOF != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
            count += n;
        }
        return count;
    }

}