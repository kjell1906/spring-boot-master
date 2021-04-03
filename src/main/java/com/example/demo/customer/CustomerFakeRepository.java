package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements  CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond", "password123", "email1@gmail.com"),
                new Customer(2L, "Jamila Armed", "password456", "email2@gmail.com"),
                new Customer(3L, "Ole Olsen", "password789", "email3@gmail.com")
        );
    }
}
