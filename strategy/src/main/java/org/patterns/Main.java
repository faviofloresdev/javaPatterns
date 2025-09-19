package org.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.checkout(250.0);

        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.checkout(120.0);

        context.setPaymentStrategy(new BitcoinPayment("1A2b3C4d5E6F"));
        context.checkout(500.0);

    }
}