package xyz.qalcyo.mango.error_handling;

/**
 * Basic generic class for handling optional values
 * @param <T> the value
 */
public class Option<T> {

    T value;

    public Option(T value) {
        this.value = value;
    }

    public void value(T value) {
        this.value = value;
    }

    public T value() {
        return this.value;
    }

    public boolean isNull() {
        return this.value == null;
    }
}
