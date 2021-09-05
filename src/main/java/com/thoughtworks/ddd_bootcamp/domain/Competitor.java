package com.thoughtworks.ddd_bootcamp.domain;

import java.util.HashMap;

public class Competitor {
    HashMap<String, Double> products= new HashMap<>();

    public void addProduct(String productName, Double price) {
        products.put(productName, price);
    }

    public Double getProductPrice(String productName) {
        return products.get(productName);
    }
}
