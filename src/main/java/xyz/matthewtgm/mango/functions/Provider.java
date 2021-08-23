package xyz.matthewtgm.mango.functions;

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface Provider<T> {
    T get();
    Provider<T> set(T value);

    boolean present();
    Provider<T> ifPresent(Consumer<T> action);

    Provider<T> filter(Filter<? super T> filter);

    T or(T other);
    <E extends Throwable> Provider<T> orThrow(Supplier<? extends E> supplier) throws E;
}