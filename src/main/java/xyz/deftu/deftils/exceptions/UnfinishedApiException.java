package xyz.deftu.deftils.exceptions;

public class UnfinishedApiException extends RuntimeException {
    public UnfinishedApiException() {
    }

    public UnfinishedApiException(String message) {
        super(message);
    }
    public UnfinishedApiException(String message, Throwable cause) {
        super(message, cause);
    }
    public UnfinishedApiException(Throwable cause) {
        super(cause);
    }
}