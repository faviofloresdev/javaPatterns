package org.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PayPalPayment implements PaymentStrategy {

    static Logger log = LoggerFactory.getLogger(PayPalPayment.class);

    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        log.info("Paid ${} using PayPal account: {}", amount, email);
    }

}
