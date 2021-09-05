package com.thoughtworks.ddd_bootcamp.bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    List<Account> accounts = new ArrayList<Account>();
    String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}
