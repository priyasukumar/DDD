package com.thoughtworks.ddd_bootcamp.domain;

import java.util.List;

public class Order {
    private final List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (var item: items) {
            totalPrice += item.product.price.amount * item.quantity + item.product.weightInGram * item.quantity * 0.01;
        }
        return totalPrice;
    }
}
