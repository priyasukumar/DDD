package com.thoughtworks.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final int id;
    private List<Item> items = new ArrayList<Item>();
    private List<Item> removedItems = new ArrayList<Item>();
    public boolean isCheckedOut = false;

    public Cart(int id) {
        this.id = id;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public boolean containsItem(Item item) {
        return items.contains(item);
    }

    public boolean containsRemovedItem(Item item) {
        return removedItems.contains(item);
    }

    public void removeItem(Item item) {
        removedItems.add(item);
        this.items.remove(item);
    }

    public double checkOut() {
        Order order = new Order(items);
        double price = order.getTotalPrice();
        isCheckedOut = true;
        return price;
    }
}
