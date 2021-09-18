package xyz.qalcyo.mango.functions.abstraction;

import xyz.qalcyo.mango.functions.Filter;
import xyz.qalcyo.mango.functions.Provider;

import java.util.function.Consumer;
import java.util.function.Supplier;

public abstract class AbstractProvider<T> implements Provider<T> {

    private T value;

    public AbstractProvider(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public AbstractProvider<T> set(T value) {
        this.value = value;
        return this;
    }

    public boolean present() {
        return value != null;
    }

    public AbstractProvider<T> ifPresent(Consumer<T> action) {
        if (value != null)
            action.accept(value);
        return this;
    }

    public AbstractProvider<T> filter(Filter<? super T> filter) {
        if (value == null) {
            return this;
        } else {
            return filter.check(value) ? this : null;
        }
    }

    public T or(T other) {
        return value != null ? value : other;
    }

    public <E extends Throwable> AbstractProvider<T> orThrow(Supplier<? extends E> supplier) throws E {
        if (value == null) {
            throw supplier.get();
        }

        return this;
    }

}