package org.hel.ccapi.data;

public class PricingObject {

    private final double amount;
    private final Currency currency;
    public PricingObject(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
