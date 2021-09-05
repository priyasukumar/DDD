package com.thoughtworks.ddd_bootcamp.domain;

import java.util.Currency;

public class Price {
    double amount;
    Currency currencyCode;

    public Price(double amount, Currency currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }
}
