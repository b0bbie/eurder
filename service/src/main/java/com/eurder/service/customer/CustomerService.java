package com.eurder.service.customer;

import com.eurder.domain.customer.Customer;
import com.eurder.domain.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customerRepository.getAllCustomers());
    }

    public Customer getCustomerById(String id){
        return customerRepository.getCustomerById(id);
    }

    public Customer saveCustomer(Customer customer){
        return customerRepository.saveCustomer(customer);
    }
    }

