package com.suganame.hexagonal.application.ports.out;

public interface SendCfpForValidationOutputPort {
    void send(String cpf);
}
