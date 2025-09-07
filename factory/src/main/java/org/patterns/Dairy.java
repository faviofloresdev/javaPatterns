package org.patterns;

public class Dairy extends Product {

    public Dairy(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDetails() {
        return "Dairy -> Name: " + name + ", Price: $" + price;
    }

}
