package com.thoughtworks.ddd_bootcamp.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class BankTest {
    @Test
    void shouldReturnAccounts() {
        Customer customer = new Customer("XYZ", "34, ABC");
        Account account = new Account("123", "12, STU", customer.name);

        customer.addAccount(account);

        assertTrue(customer.accounts.contains(account));
    }
}