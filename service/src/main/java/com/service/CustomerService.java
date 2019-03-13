package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.domain.Customer;
import com.persistence.CustomerDao;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerDao customerDao;

    public List<Customer> findAll() {
        List<Customer> customerList = customerDao.findAll();
        return customerList;
    }

    public Customer findBycustomerId(int customerId) {

        Customer customer = customerDao.findBycustomerId(customerId);
        return customer;

    }

    public Customer save(Customer customer) {

        return customerDao.save(customer);
    }
}


