package com.suganame.hexagonal.adapters.out;

import com.suganame.hexagonal.adapters.out.repository.CustomerRepository;
import com.suganame.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.suganame.hexagonal.application.core.domain.Customer;
import com.suganame.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        System.out.println("customerEntity " + customerEntity);
        customerRepository.insert(customerEntity);
    }
}
