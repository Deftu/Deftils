package xyz.qalcyo.mango;

import org.junit.jupiter.api.Test;
import xyz.qalcyo.mango.functions.Provider;
import xyz.qalcyo.mango.functions.impl.ImmutableProvider;
import xyz.qalcyo.mango.functions.impl.MutableProvider;

public class ProviderTest {

    @Test
    public void mutable() {
        Provider<String> provider = new MutableProvider<>();
        System.out.println(provider);
        System.out.println(provider.get());

        provider.set("Hello, World!");
        System.out.println(provider);
        System.out.println(provider.get());

        provider.set(null);
        System.out.println(provider.or("Null provider."));
    }

    @Test
    public void immutable() {
        Provider<String> provider = new ImmutableProvider<>("Immutable.");
        System.out.println(provider);
        System.out.println(provider.get());

        provider = new ImmutableProvider<>("Hi...");
        System.out.println(provider);
        System.out.println(provider.get());
    }

    @Test
    public void mutableOf() {
        Provider<String> provider = Provider.of("Mutable.");
        System.out.println(provider);
        System.out.println(provider.get());

        provider.set("Hello, World!");
        System.out.println(provider);
        System.out.println(provider.get());

        provider.set(null);
        System.out.println(provider.or("Null provider."));
    }

}