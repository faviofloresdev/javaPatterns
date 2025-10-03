package org.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Product apple = ProductFactory.createProduct(ProductType.FRUIT, "Apple", 0.99);
        Product carrot = ProductFactory.createProduct(ProductType.VEGETABLE, "Carrot", 0.59);
        Product milk = ProductFactory.createProduct(ProductType.DAIRY, "Milk", 1.49);

        log.info("Instance {} - {}", apple.getClass().getName(), apple.getDetails());
        log.info("Instance {} - {}", carrot.getClass().getName(), carrot.getDetails());
        log.info("Instance {} - {}", milk.getClass().getName(), milk.getDetails());

    }
}