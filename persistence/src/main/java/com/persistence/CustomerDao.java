package com.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.domain.Customer;
import java.util.List;

@Repository
public class CustomerDao {
    @Autowired
    CustomerRepository customerRepository;

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public Customer findBycustomerId(int customerId){
        return customerRepository.findBycustomerId(customerId).get();
    }

    public void delete(Customer customer){
        customerRepository.delete(customer);
    }


}
