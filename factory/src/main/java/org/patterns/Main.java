package org.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        // Build a product using the builder
        Product apple = new Product.Builder()
                .name("Apple")
                .category("Fruit")
                .price(0.99)
                .inStock(true)
                .build();

        Product laptop = new Product.Builder()
                .name("Laptop")
                .category("Electronics")
                .price(1299.99)
                .inStock(false)
                .build();

        System.out.println(apple);
        System.out.println(laptop);

    }
}