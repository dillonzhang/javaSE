package com.test.java.section11;

import static com.test.java.section11.Util.delay;
import static com.test.java.section11.Util.format;

import java.util.Random;

public class AsyncShop {
    private final String name;
    private final Random random;

    public AsyncShop(String name) {
        this.name = name;
        random = new Random(name.charAt(0)*name.charAt(1)*name.charAt(2));
    }

    private double calculatePrice(String product) {
        delay();
        if (true) throw new RuntimeException("product not available");
        return format(random.nextDouble() * product.charAt(0) + product.charAt(1));
    }
}
