package com.eurder.api;

import com.eurder.domain.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
        public CustomerDto mapToCustomerDto(Customer customer) {
            CustomerDto customerDto = new CustomerDto();
            customerDto.setFirstName(customer.getFirstName());
            customerDto.setLastName(customer.getLastName());
            return customerDto;
        }
    }

