package com.thoughtworks.ddd_bootcamp.domain.domain_service;

import com.thoughtworks.ddd_bootcamp.domain.Competitor;
import com.thoughtworks.ddd_bootcamp.domain.Price;

import java.util.Currency;

public class PriceCalculator {
    Competitor competitor;

    public PriceCalculator(Competitor competitor) {
        this.competitor = competitor;
    }

    public Price getDiscountedPrice(String productName) {
        double price = competitor.getProductPrice(productName);
        double discountedPrice = price - price * 0.1;
        return new Price(discountedPrice,  Currency.getInstance("INR"));
    }
}
