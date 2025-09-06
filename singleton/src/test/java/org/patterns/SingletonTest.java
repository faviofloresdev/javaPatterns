package org.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void testSingletonInstancesAreSameEver() {
        Singleton instance1 = Singleton.getInstance();
        for (int i = 0; i < 100; i++) {
            Singleton instance2 = Singleton.getInstance();
            // Verify both references point to the same object
            assertSame(instance1, instance2, "Instances should be the same");
        }
    }

    @Test
    void testSingletonInstancesAreSame() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Verify both references point to the same object
        assertSame(instance1, instance2, "Instances should be the same");
    }

    @Test
    void testSingletonMethod() {
        Singleton instance = Singleton.getInstance();

        String message = instance.sayHello();
        // Verify the returned message is correct
        assertEquals("Hello from Singleton", message, "Message should match");
    }
}