package com.eurder.api;

import com.eurder.domain.Customer;
import com.eurder.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (path = "/customers")
public class CustomerController {
    private CustomerService customerService;
    private CustomerMapper customerMapper;

    @Autowired
    public CustomerController(CustomerService customerService, CustomerMapper customerMapper) {
        this.customerService = customerService;
        this.customerMapper = customerMapper;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDto createCustomer(@RequestBody CreateCustomerDto createCustomerDto) {
        return customerMapper.mapToCustomerDto(customerService.saveCustomer(new Customer(createCustomerDto.getFirstName(),
                createCustomerDto.getLastName(), createCustomerDto.getEmailAddress(), createCustomerDto.getAddress(),
                createCustomerDto.getPhoneNumber())));
    }
}
