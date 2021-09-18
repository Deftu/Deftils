package xyz.qalcyo.mango.functions;

@FunctionalInterface
public interface QuadConsumer<T, U, V, W> {
    void accept(T t, U u, V v, W w);
    default QuadConsumer<T, U, V, W> andThen(QuadConsumer<T, U, V, W> other) {
        return (t, u, v, w) -> {
            accept(t, u, v, w);
            other.accept(t, u, v, w);
        };
    }
}