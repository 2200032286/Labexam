package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // GET request to view all customers
    @GetMapping
    public List<Customer> viewAllCustomers() {
        return customerService.getAllCustomers();
    }
}
