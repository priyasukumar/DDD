package com.thoughtworks.ddd_bootcamp.bank;

public class Account {
    String accountNumber;
    String address;
    String accountHolder;

    public Account(String accountNumber, String address, String accountHolder) {
        this.accountNumber = accountNumber;
        this.address = address;
        this.accountHolder = accountHolder;
    }
}
