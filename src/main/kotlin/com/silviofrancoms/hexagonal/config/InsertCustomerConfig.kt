package com.silviofrancoms.hexagonal.config

import com.silviofrancoms.hexagonal.adapters.out.FindAddressByZipCodeAdapter
import com.silviofrancoms.hexagonal.adapters.out.InsertCustomerAdapter
import com.silviofrancoms.hexagonal.adapters.out.SendCpfForValidationAdapter
import com.silviofrancoms.hexagonal.application.core.usecase.InsertCustomerUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertCustomerConfig {

    @Bean
    fun insertCustomer(
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        insertCustomerAdapter: InsertCustomerAdapter,
        sendCpfForValidationAdapter: SendCpfForValidationAdapter
    ) = InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter)

}