package com.example.demo.customer;

import com.example.demo.DemoJ16Application;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping
    Customer customer() {
        return new Customer(1L, "James Bond");
    }

}
