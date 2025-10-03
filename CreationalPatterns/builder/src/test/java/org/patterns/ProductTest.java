package org.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    public void testBuilder() {
        // Usando el Builder para crear un Producto
        Product product = new Product.Builder()
                .name("Jabon Infantil")
                .price(5.99)
                .category("Higiene")
                .inStock(true)
                .build();

        // Verificaciones con JUnit
        assertEquals("Jabon Infantil", product.getName());
        assertEquals(5.99, product.getPrice());
        assertEquals("Higiene", product.getCategory());
        assertTrue(product.isInStock());
    }

}