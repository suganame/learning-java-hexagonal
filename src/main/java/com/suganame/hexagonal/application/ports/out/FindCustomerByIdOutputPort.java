package com.suganame.hexagonal.application.ports.out;

import com.suganame.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
