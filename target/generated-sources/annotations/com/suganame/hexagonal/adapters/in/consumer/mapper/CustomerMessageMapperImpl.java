package com.suganame.hexagonal.adapters.in.consumer.mapper;

import com.suganame.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.suganame.hexagonal.application.core.domain.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-13T16:58:56-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class CustomerMessageMapperImpl implements CustomerMessageMapper {

    @Override
    public Customer toCustomer(CustomerMessage customerMessage) {
        if ( customerMessage == null ) {
            return null;
        }

        Customer customer = new Customer();

        return customer;
    }
}
