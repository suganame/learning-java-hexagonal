package com.suganame.hexagonal.application.ports.out;

import com.suganame.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update(Customer customer);
}
