package com.suganame.hexagonal.adapters.out.client.mapper;

import com.suganame.hexagonal.adapters.out.client.response.AddressResponse;
import com.suganame.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
