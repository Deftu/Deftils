package xyz.qalcyo.mango.functions;

@FunctionalInterface
public interface Filter<T> {
    boolean check(T test);
    default Filter<T> and(Filter<T> other) {
        return (t) -> check(t) && other.check(t);
    }
}