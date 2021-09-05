package com.thoughtworks.ddd_bootcamp.domain;

import com.thoughtworks.ddd_bootcamp.domain.domain_service.PriceCalculator;
import org.junit.jupiter.api.Test;

import java.util.Currency;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    final Currency inr = Currency.getInstance("INR");

    @Test
    void shouldAddIpadToTheCart() {
        Competitor competitor = new Competitor();
        competitor.addProduct("Ipad", 100.0);
        Product product = new Product("Ipad", new PriceCalculator(competitor).getDiscountedPrice("Ipad"), 10);
        Item item = new Item(product, 1);

        Cart cart = new CartFactory().createCart();
        cart.addItem(item);
        double amount = cart.checkOut();

        assertTrue(cart.containsItem(item));
        assertTrue(cart.isCheckedOut);
        System.out.println(amount);
    }

//    @Test
//    void shouldAddHeroPenToTheCart() {
//        Product product = new Product("Hero ink pen", new Price(30, inr));
//        Item item = new Item(product, 1);
//
//        Cart cart = new CartFactory().createCart();
//        cart.addItem(item);
//
//        assertTrue(cart.containsItem(item));
//    }
//
//    @Test
//    void shouldAddTwoBatToTheCart() {
//        Product product = new Product("GM Cricket Bat", new Price(60, inr));
//        Item item = new Item(product, 2);
//
//        Cart cart = new CartFactory().createCart();
//        cart.addItem(item);
//
//        assertTrue(cart.containsItem(item));
//    }
//
//    @Test
//    void shouldRemoveProductFromCart() {
//        Product product = new Product("GM Cricket Bat", new Price(60, inr));
//        Item item = new Item(product, 2);
//
//        Cart cart = new CartFactory().createCart();
//        cart.addItem(item);
//        cart.removeItem(item);
//
//        assertFalse(cart.containsItem(item));
//
//    }
//
//    @Test
//    void shouldReturnRemovedProductsFromCart() {
//        Product product = new Product("GM Cricket Bat", new Price(60, inr));
//        Product product2 = new Product("Hero pen", new Price(30, inr));
//        Item item = new Item(product, 2);
//        Item item2 = new Item(product2, 1);
//
//        Cart cart = new CartFactory().createCart();
//        cart.addItem(item);
//        cart.addItem(item2);
//        cart.removeItem(item);
//
//        assertTrue(cart.containsRemovedItem(item));
//    }
//
//    @Test
//    void shouldReturnNotEqualsForTwoCarts() {
//        Cart cart1 = new CartFactory().createCart();
//        Cart cart2 = new CartFactory().createCart();
//
//        Item item1 = new Item(new Product("Ipad", new Price(100, inr)), 1);
//        Item item2 = new Item(new Product("Ipad", new Price(100, inr)), 1);
//
//        cart1.addItem(item1);
//        cart2.addItem(item2);
//
//        assertNotEquals(cart1, cart2);
//    }
}
