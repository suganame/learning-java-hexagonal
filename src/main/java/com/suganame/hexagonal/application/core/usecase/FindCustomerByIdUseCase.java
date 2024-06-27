package com.suganame.hexagonal.application.core.usecase;

import com.suganame.hexagonal.application.core.domain.Customer;
import com.suganame.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.suganame.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
