package com.suganame.hexagonal.application.config;

import com.suganame.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.suganame.hexagonal.adapters.out.InsertCustomerAdapter;
import com.suganame.hexagonal.adapters.out.SendCpfForValidationAdapter;
import com.suganame.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {
    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }
}
