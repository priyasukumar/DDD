package com.thoughtworks.ddd_bootcamp.domain;

public class CartFactory {

    private static int cartId=1;
    public Cart createCart()
    {
        return  new Cart(cartId++);
    }
}
