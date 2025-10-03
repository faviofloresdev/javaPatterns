package org.patterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentContextTest {

    private PaymentContext context;

    @BeforeEach
    void setUp() {
        context = new PaymentContext();
    }

    @Test
    void testCreditCardPayment() {
        PaymentStrategy strategy = new CreditCardPayment("1234-5678-9876-5432");
        context.setPaymentStrategy(strategy);

        assertDoesNotThrow(() -> context.checkout(250.0));
    }

    @Test
    void testPayPalPayment() {
        PaymentStrategy strategy = new PayPalPayment("user@example.com");
        context.setPaymentStrategy(strategy);

        assertDoesNotThrow(() -> context.checkout(120.0));
    }

    @Test
    void testBitcoinPayment() {
        PaymentStrategy strategy = new BitcoinPayment("1A2b3C4d5E6F");
        context.setPaymentStrategy(strategy);

        assertDoesNotThrow(() -> context.checkout(500.0));
    }

    @Test
    void testNoStrategyThrowsException() {
        Exception ex = assertThrows(IllegalStateException.class, () -> context.checkout(100.0));
        assertEquals("Payment strategy not set!", ex.getMessage());
    }

}