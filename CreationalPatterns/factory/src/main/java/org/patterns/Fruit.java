package org.patterns;

public class Fruit extends Product {

    public Fruit(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDetails() {
        return "Fruit -> Name: " + name + ", Price: $" + price;
    }

}
