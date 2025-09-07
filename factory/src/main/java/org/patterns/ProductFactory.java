package org.patterns;

public class ProductFactory {

    public static Product createProduct(ProductType type, String name, double price) {
        return switch (type) {
            case FRUIT -> new Fruit(name, price);
            case VEGETABLE -> new Vegetable(name, price);
            case DAIRY -> new Dairy(name, price);
        };
    }

}
