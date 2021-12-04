package xyz.deftu.deftils.exceptions.handling;

/**
 * Error handling, utility without using exceptions.
 */
public class Result<T> {

    private boolean success;
    private String errorMessage;
    private T value;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
