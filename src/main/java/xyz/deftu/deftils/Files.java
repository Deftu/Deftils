package xyz.deftu.deftils;

import xyz.deftu.deftils.exceptions.FileFormatException;

import java.io.*;

public class Files {

    /**
     * Writes the content provided to a file.
     *
     * @param file The file to write to. (created if it doesn't exist.)
     * @param content The content to write to the file.
     */
    public static void write(File file, String content) {
        BufferedWriter writer = null;
        try {
            if (!file.exists() || !file.isFile())
                file.createNewFile();
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(content);
        } catch (Exception e) {
            e.printStackTrace();
            if (writer != null) {
                try {
                    writer.flush();
                    writer.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        } finally {
            if (writer != null) {
                try {
                    writer.flush();
                    writer.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Reads the contents of a file and returns them.
     *
     * @param file The file to read from.
     * @return The contents of the provided file.
     */
    public static String read(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder builder = new StringBuilder();
            reader.lines().forEach(builder::append);
            return builder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Provides the file extension of the filename specified.
     *
     * @param filename The name or path to a file.
     * @return The file extension of the file provided.
     */
    public static String fileExtensionOf(String filename) {
        int i = filename.lastIndexOf('.');
        if (i == -1)
            throw new FileFormatException("Unable to get file extension.");
        return filename.substring(i);
    }

    /**
     * Provides the file extension of the file specified.
     *
     * @param file The file to get the extension of.
     * @return The file extension of the file provided.
     */
    public static String fileExtensionOf(File file) {
        return fileExtensionOf(file.getAbsolutePath());
    }

    /**
     * Ensures that a file exists, attempts to create it if not and throws an error if unable.
     *
     * @param file The file to make checks for.
     * @param directory Whether this file is a directory or not.
     * @return The file provided.
     */
    public static File ensureFileExists(File file, boolean directory) {
        try {
            if (!file.exists()) {
                if (directory && !file.mkdirs()) {
                    throw new FileFormatException("Unable to create directory.");
                } else if (!file.createNewFile()) {
                    throw new FileFormatException("Unable to create file.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return file;
    }

    /**
     * Ensures that a file exists, attempts to create it if not and throws an error if unable.
     *
     * @param file The file to make checks for.
     * @return The file provided.
     */
    public static File ensureFileExists(File file) {
        return ensureFileExists(file, false);
    }

}