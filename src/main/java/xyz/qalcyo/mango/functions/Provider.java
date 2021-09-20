package xyz.qalcyo.mango.functions;

import xyz.qalcyo.mango.functions.impl.ImmutableProvider;
import xyz.qalcyo.mango.functions.impl.MutableProvider;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface Provider<T> {

    default boolean isMutable() {
        return this instanceof MutableProvider;
    }

    default boolean isImmutable() {
        return !isMutable();
    }

    T get();
    Provider<T> set(T value);

    boolean present();
    Provider<T> ifPresent(Consumer<T> action);

    Provider<T> filter(Filter<? super T> filter);

    T or(T other);
    <E extends Throwable> Provider<T> orThrow(Supplier<? extends E> supplier) throws E;

    default Optional<T> asOptional() {
        return present() ? Optional.of(get()) : Optional.empty();
    }

    static <T> Provider<T> empty(boolean immutable) {
        return immutable ? new ImmutableProvider<>(null) : new MutableProvider<>();
    }

    static <T> Provider<T> empty() {
        return empty(false);
    }

    static <T> Provider<T> of(boolean immutable, T value) {
        return immutable ? new ImmutableProvider<>(value) : new MutableProvider<>(value);
    }

    static <T> Provider<T> of(T value) {
        return of(false, value);
    }

}