package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "api/v1/customer")
@RestController
@Deprecated
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping(value = "all")
    List<Customer> getCustomer() {
        return customerService.getCustomers();
    }

    @PostMapping
    public void createNewCustomer(@RequestBody Customer customer){
        System.out.println("POST REQUEST");
        System.out.println(customer);
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer customer){
        System.out.println("PUT/UPDATE REQUEST");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Long customerId){
        System.out.println("DELETE REQUEST FOR CUSTOMER WIDTH ID " + customerId);
    }

}
