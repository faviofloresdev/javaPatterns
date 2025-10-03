package org.patterns;

public class Product {

    private final String name;
    private final String category;
    private final double price;
    private final boolean inStock;

    // Private constructor, only accessible from Builder
    private Product(Builder builder) {
        this.name = builder.name;
        this.category = builder.category;
        this.price = builder.price;
        this.inStock = builder.inStock;
    }


    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }


    // Static inner Builder class
    public static class Builder {
        private String name;
        private String category;
        private double price;
        private boolean inStock;

        public Builder name(String name) {
            this.name = name;
            return this; // allows chaining
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder inStock(boolean inStock) {
            this.inStock = inStock;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', category='" + category +
                "', price=" + price + ", inStock=" + inStock + "}";
    }
}
