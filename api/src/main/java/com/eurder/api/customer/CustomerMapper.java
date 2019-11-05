package com.eurder.api.customer;

import com.eurder.domain.customer.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
        public CustomerDto mapToCustomerDto(Customer customer) {
            CustomerDto customerDto = new CustomerDto();
            customerDto.setId(customer.getId());
            customerDto.setFirstName(customer.getFirstName());
            customerDto.setLastName(customer.getLastName());
            customerDto.setAddress(customer.getAddress());
            customerDto.setEmailAddress(customer.getEmailAddress());
            customerDto.setPhoneNumber(customer.getPhoneNumber());
            return customerDto;
        }
    }

