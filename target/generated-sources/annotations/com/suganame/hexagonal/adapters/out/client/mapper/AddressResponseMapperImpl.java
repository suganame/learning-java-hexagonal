package com.suganame.hexagonal.adapters.out.client.mapper;

import com.suganame.hexagonal.adapters.out.client.response.AddressResponse;
import com.suganame.hexagonal.application.core.domain.Address;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-13T16:58:56-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class AddressResponseMapperImpl implements AddressResponseMapper {

    @Override
    public Address toAddress(AddressResponse addressResponse) {
        if ( addressResponse == null ) {
            return null;
        }

        Address address = new Address();

        return address;
    }
}
