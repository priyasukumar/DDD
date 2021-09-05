package com.thoughtworks.ddd_bootcamp.domain;

public class Product {
    String productName;
    Price price;
    double weightInGram;

    public Product(String productName, Price price, double weight) {
        this.productName = productName;
        this.price = price;
        this.weightInGram = weight;
    }


}
