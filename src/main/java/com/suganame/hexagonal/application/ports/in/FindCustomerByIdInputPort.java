package com.suganame.hexagonal.application.ports.in;

import com.suganame.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}
