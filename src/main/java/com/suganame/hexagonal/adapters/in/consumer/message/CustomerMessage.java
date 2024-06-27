package com.suganame.hexagonal.adapters.in.consumer.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerMessage {
    private String id;
    private String name;
    private String zipCode;
    private String cpf;
    private Boolean isValidCpf;
}
