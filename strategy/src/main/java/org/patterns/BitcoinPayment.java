package org.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BitcoinPayment implements PaymentStrategy {

    static Logger log = LoggerFactory.getLogger(BitcoinPayment.class);

    private final String wallet;

    public BitcoinPayment(String wallet) {
        this.wallet = wallet;
    }

    public void pay(double amount) {
        log.info("Paid ${} using Bitcoin wallet: {}", amount, wallet);
    }

}
