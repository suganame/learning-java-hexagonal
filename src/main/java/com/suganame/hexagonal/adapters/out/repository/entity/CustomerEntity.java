package com.suganame.hexagonal.adapters.out.repository.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customers")
@ToString
public class CustomerEntity {

    private String id;
    private String name;
    private AddressEntity address;
    private String cpf;
    private Boolean isValidCpf;
}
