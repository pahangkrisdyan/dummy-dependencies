package com.github.pahangkrisdyan;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

import java.util.function.Supplier;

@Singleton
@Named("2-dummy-dependency")
public class Dependency2Impl implements Supplier<String> {

    private final Supplier<String> textFromMainSupplier;

    public Dependency2Impl(@Named("text-from-main-supplier") Supplier<String> textFromMainSupplier) {
        this.textFromMainSupplier = textFromMainSupplier;
    }

    @Override
    public String get() {
        return "This is a text from dependency 2! It is able to get value from main -> " + textFromMainSupplier.get();
    }
}
