package xyz.qalcyo.mango.functions;

@FunctionalInterface
public interface TriConsumer<T, U, V> {
    void accept(T t, U u, V v);
    default TriConsumer<T, U, V> andThen(TriConsumer<T, U, V> other) {
        return (t, u, v) -> {
            accept(t, u, v);
            other.accept(t, u, v);
        };
    }
}