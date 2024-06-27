package com.suganame.hexagonal.adapters.out;

import com.suganame.hexagonal.adapters.out.repository.CustomerRepository;
import com.suganame.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.suganame.hexagonal.application.core.domain.Customer;
import com.suganame.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        System.out.println("customer " + customer);
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
