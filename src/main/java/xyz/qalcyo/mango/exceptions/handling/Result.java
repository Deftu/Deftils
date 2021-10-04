package xyz.qalcyo.mango.exceptions.handling;

/**
 * Error handling, utility without using exceptions
 * <pre>{@code
 *         // Example
 *         Result<String> test;
 *
 *         if (...) {
 *             test.success(false);
 *             test.errorMessage("Failed to do stuff!");
 *             return test;
 *         }
 *
 *         test.success(true);
 *         test.value("Yay!");
 * }</pre>
 */
public class Result<T> {

    private boolean success;
    private String errorMessage;
    private T value;

    public Result() {}

    public void success(boolean success) {
        this.success = success;
    }

    public void errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void value(T value) {
        this.value = value;
    }

    public boolean success() {
        return this.success;
    }

    public String errorMessage() {
        return this.errorMessage;
    }

    public T value() {
        return this.value;
    }

}
