
package com.github.pahangkrisdyan;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

import java.util.function.Supplier;

@Singleton
@Named("1-dummy-dependency")
public class Dependency1Impl implements Supplier<String> {

    private final Supplier<String> textFromMainSupplier;

    public Dependency1Impl(@Named("text-from-main-supplier") Supplier<String> textFromMainSupplier) {
        this.textFromMainSupplier = textFromMainSupplier;
    }

    @Override
    public String get() {
        return "This is a text from dependency 1! It is able to get value from main -> " + textFromMainSupplier.get();
    }
}