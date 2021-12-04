package xyz.deftu.deftils.exceptions;

public class FileFormatException extends RuntimeException {
    public FileFormatException() {
    }

    public FileFormatException(String message) {
        super(message);
    }
    public FileFormatException(String message, Throwable cause) {
        super(message, cause);
    }
    public FileFormatException(Throwable cause) {
        super(cause);
    }
}
