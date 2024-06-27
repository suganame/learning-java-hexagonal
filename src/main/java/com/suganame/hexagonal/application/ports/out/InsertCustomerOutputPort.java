package com.suganame.hexagonal.application.ports.out;

import com.suganame.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
