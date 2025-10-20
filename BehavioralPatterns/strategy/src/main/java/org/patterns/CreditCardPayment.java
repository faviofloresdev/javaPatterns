package org.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCardPayment implements PaymentStrategy {

    static Logger log = LoggerFactory.getLogger(CreditCardPayment.class);

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        log.info("Paid ${} using Credit Card: {}", amount, cardNumber);
    }

}
