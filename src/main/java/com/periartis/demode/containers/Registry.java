package com.periartis.demode.containers;

import javax.annotation.processing.Filer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Registry<V> {
    private final String name;
    private final LinkedHashSet<V> values = new LinkedHashSet<>();
    private final LinkedHashMap<Object, Registry<V>> children = new LinkedHashMap<>();

    public Registry(String name) {
        this.name = name;
    }

    public Registry() {
        this.name = null;
    }

    public void get(Object... keys) {

    }
    public void put(V value) {

    }

    public class Filer {
        final V item;

        public Filer(V item) {
            this.item = item;
        }

        public void under(Object... keys) {
        }
    }

}
