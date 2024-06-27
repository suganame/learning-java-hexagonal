package com.suganame.hexagonal.application.ports.out;

import com.suganame.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
