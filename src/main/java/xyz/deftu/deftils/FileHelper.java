package xyz.deftu.deftils;

import xyz.deftu.deftils.exceptions.FileFormatException;

import java.io.*;

public class FileHelper {
    /**
     * Provides the file extension of the filename specified.
     *
     * @param filename The name or path to a file.
     * @return The file extension of the file provided.
     */
    public static String retrieveFileExtensionOf(String filename) throws FileFormatException {
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
    public static String retrieveFileExtensionOf(File file) throws FileFormatException {
        return retrieveFileExtensionOf(file.getAbsolutePath());
    }

    /**
     * Ensures that a file exists, attempts to create it if not and throws an error if unable.
     *
     * @param file The file to make checks for.
     * @param directory Whether this file is a directory or not.
     * @return The file provided.
     */
    public static File ensureFileExists(File file, boolean directory) throws IOException, FileFormatException {
        if (!file.exists()) {
            if (directory && !file.mkdirs()) {
                throw new FileFormatException("Unable to create directory.");
            } else if (!file.createNewFile()) {
                throw new FileFormatException("Unable to create file.");
            }
        }
        return file;
    }

    /**
     * Ensures that a file exists, attempts to create it if not and throws an error if unable.
     *
     * @param file The file to make checks for.
     * @return The file provided.
     */
    public static File ensureFileExists(File file) throws IOException, FileFormatException {
        return ensureFileExists(file, false);
    }
}