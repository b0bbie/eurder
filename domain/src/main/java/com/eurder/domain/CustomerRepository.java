package com.eurder.domain;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomerRepository {

    private Map<String, Customer> customerRepository = new HashMap<>();

    public Collection<Customer> getAllCustomers() {
        return customerRepository.values();
    }

    public Customer getCustomerById(String id) {
        return customerRepository.get(id);
    }

    public Customer saveCustomer(Customer customer){
        customerRepository.put(customer.getId(), customer);
        return customer;
    }
}
