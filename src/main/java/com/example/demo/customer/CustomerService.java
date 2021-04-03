package com.example.demo.customer;

import com.example.demo.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    private final static Logger LOGGER =
            LoggerFactory.getLogger(CustomerService.class);

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(
            CustomerRepository customerRepo) {
        this.customerRepository = customerRepo;
    }

    List<Customer> getCustomers() {
        LOGGER.info("getCustomers was called");
        return customerRepository.findAll();
    }

    Customer getCustomer(Long customerId) {

        return customerRepository
                .findById(customerId)
                .orElseThrow(() -> {
                    NotFoundException notFoundException =
                            new NotFoundException("Customer " + customerId + " not found");
                    LOGGER.error("errorGetCustomer", notFoundException);
                    return notFoundException;
                });
    }
}
