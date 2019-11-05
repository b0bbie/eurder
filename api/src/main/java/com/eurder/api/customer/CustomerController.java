package com.eurder.api.customer;

import com.eurder.domain.customer.Customer;
import com.eurder.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping (path = "customers")
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

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerDto> getAllCustomers() {
        return customerService.getAllCustomers().stream()
                .map(customer -> customerMapper.mapToCustomerDto(customer))
                .collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public CustomerDto getCustomerById(@PathVariable String id) {
        return customerMapper.mapToCustomerDto(customerService.getCustomerById(id));
    }
}
