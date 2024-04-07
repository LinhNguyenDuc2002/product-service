package com.example.productservice.mapper;

import com.example.productservice.dto.CustomerDTO;
import com.example.productservice.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper extends AbstractMapper<Customer, CustomerDTO> {
    @Override
    public Class<CustomerDTO> getDtoClass() {
        return null;
    }

    @Override
    public Class<Customer> getEntityClass() {
        return null;
    }
}
