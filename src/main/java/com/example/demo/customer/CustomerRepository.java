package com.example.demo.customer;

import java.util.Collections;
import java.util.List;

public class CustomerRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
        return Collections.singletonList(
                new Customer(1L, "Implement Real DB", "Todo", "email1@gmail.com")
        );
    }
}
