package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
public class CustomerService {

    private CustomerRepo customerRepo;

    @Autowired
    public CustomerService(
            CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }

    Customer getCustomer(Long customerId) {
        return customerRepo.getCustomers()
                .stream()
                .filter(customer -> customer.getId().equals(customerId))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Customer not found"));
    }
}
