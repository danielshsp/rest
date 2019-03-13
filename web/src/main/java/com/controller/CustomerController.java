package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.domain.Customer;
import com.service.CustomerService;
import java.util.List;

@RestController
@RequestMapping(value= "/rest")
public class CustomerController {

    @Autowired
     CustomerService customerService;

    @GetMapping(value = "/customer/all")
    public List<Customer> getAllCustomer(){
        return customerService.findAll();
    }

    @GetMapping(value = "/customer/{id}")
    @CrossOrigin
    public Customer findById(@PathVariable final int id){
        return customerService.findBycustomerId(id);
    }

    @PostMapping(value="/create/customer")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.save(customer);
    }



}
