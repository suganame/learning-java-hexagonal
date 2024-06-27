package com.suganame.hexagonal.application.core.usecase;

import com.suganame.hexagonal.application.core.domain.Customer;
import com.suganame.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.suganame.hexagonal.application.ports.in.UpdateCustomerInputPort;
import com.suganame.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.suganame.hexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    public UpdateCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    @Override
    public void update(Customer customer, String zipCode) {
        System.out.println("customer " + customer);
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }
}
