package com.ecommerce.customerservice.service;

import com.ecommerce.customerservice.entity.Customer;
import com.ecommerce.customerservice.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        log.info("Inside saveCustomer method of CustomerService");
        return customerRepository.save(customer);
    }

    public Optional<Customer> findByCustomerId(Integer id) {
        log.info("Inside findByCustomerId method of CustomerService");
        return customerRepository.findById(id);
    }

}
