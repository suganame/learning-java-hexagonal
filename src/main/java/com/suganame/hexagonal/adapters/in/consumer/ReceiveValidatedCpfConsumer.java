package com.suganame.hexagonal.adapters.in.consumer;

import com.suganame.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.suganame.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.suganame.hexagonal.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "suganame")
    public void receive(CustomerMessage customerMessage) {
        System.out.println("customerMessage " + customerMessage);
        var customer = customerMessageMapper.toCustomer(customerMessage);
        System.out.println("customer " + customer);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
