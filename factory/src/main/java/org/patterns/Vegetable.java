package org.patterns;

public class Vegetable extends Product {

    public Vegetable(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDetails() {
        return "Vegetable -> Name: " + name + ", Price: $" + price;
    }

}
