package com.suganame.hexagonal.application.core.usecase;

import com.suganame.hexagonal.application.core.domain.Customer;
import com.suganame.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.suganame.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.suganame.hexagonal.application.ports.out.InsertCustomerOutputPort;
import com.suganame.hexagonal.application.ports.out.SendCfpForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort,
            SendCfpForValidationOutputPort sendCfpForValidationOutputPort
    ) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCfpForValidationOutputPort = sendCfpForValidationOutputPort;
    }

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;
    private final SendCfpForValidationOutputPort sendCfpForValidationOutputPort;

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCfpForValidationOutputPort.send(customer.getCpf());
    }

}
