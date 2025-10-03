package org.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductFactoryTest {

    @Test
    void testCreateFruit() {
        Product apple = ProductFactory.createProduct(ProductType.FRUIT, "Apple", 0.99);

        assertNotNull(apple, "Factory should return a valid product");
        assertEquals("Fruit -> Name: Apple, Price: $0.99", apple.getDetails());
        assertTrue(apple instanceof Fruit, "Product should be of type Fruit");
    }

    @Test
    void testCreateVegetable() {
        Product carrot = ProductFactory.createProduct(ProductType.VEGETABLE, "Carrot", 0.59);

        assertNotNull(carrot);
        assertEquals("Vegetable -> Name: Carrot, Price: $0.59", carrot.getDetails());
        assertTrue(carrot instanceof Vegetable);
    }

    @Test
    void testCreateDairy() {
        Product milk = ProductFactory.createProduct(ProductType.DAIRY, "Milk", 1.49);

        assertNotNull(milk);
        assertEquals("Dairy -> Name: Milk, Price: $1.49", milk.getDetails());
        assertTrue(milk instanceof Dairy);
    }

}