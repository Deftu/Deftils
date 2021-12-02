package xyz.deftu.deftils;

import org.junit.jupiter.api.Test;
import xyz.deftu.deftils.functions.Provider;
import xyz.deftu.deftils.functions.impl.ImmutableProvider;
import xyz.deftu.deftils.functions.impl.MutableProvider;

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