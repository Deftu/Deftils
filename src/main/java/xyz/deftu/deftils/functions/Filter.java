package xyz.deftu.deftils.functions;

import java.util.function.Predicate;

@FunctionalInterface
public interface Filter<T> {
    boolean check(T test);

    default Filter<T> and(Filter<T> other) {
        return (t) -> check(t) && other.check(t);
    }

    default Predicate<T> asPredicate() {
        return this::check;
    }
}