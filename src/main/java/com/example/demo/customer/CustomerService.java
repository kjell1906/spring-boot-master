package com.example.demo.customer;

import com.example.demo.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(
            CustomerRepository customerRepo) {
        this.customerRepository = customerRepo;
    }

    List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    Customer getCustomer(Long customerId) {
        return customerRepository
                .findById(customerId)
                .orElseThrow(() -> new NotFoundException("Customer " + customerId +" not found"));
    }
}
