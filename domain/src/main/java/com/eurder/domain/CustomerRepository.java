package com.eurder.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {

    private Map<String, Customer> customerRepository = new HashMap<>();

    public Collection<Customer> getAllCustomers() {
        return customerRepository.values();
    }

    public Customer saveCustomer(Customer customer){
        customerRepository.put(customer.getId(), customer);
        return customer;
    }
}
