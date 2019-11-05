package com.eurder.service;

import com.eurder.domain.Customer;
import com.eurder.domain.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customerRepository.getAllCustomers());
    }

    public Customer saveCustomer(Customer customer){
        return customerRepository.saveCustomer(customer);
    }

//    public Customer createCustomer (CreateCustomerDto){

//        public Professor createProfessor(CreateProfessorDto createProfessorDto) {
//            return new Professor(createProfessorDto.getFirstName(), createProfessorDto.getLastName());
//        }
    }

