package com.silviofrancoms.hexagonal.config

import com.silviofrancoms.hexagonal.adapters.out.FindAddressByZipCodeAdapter
import com.silviofrancoms.hexagonal.adapters.out.SendCpfForValidationAdapter
import com.silviofrancoms.hexagonal.adapters.out.UpdateCustomerAdapter
import com.silviofrancoms.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import com.silviofrancoms.hexagonal.application.core.usecase.UpdateCustomerUseCase
import com.silviofrancoms.hexagonal.application.ports.`in`.UpdateCustomerInputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UpdateCustomerConfig {

    @Bean
    fun updateCustomer(
        findCustomerByIdUseCase: FindCustomerByIdUseCase,
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        updateCustomerAdapter: UpdateCustomerAdapter,
        sendCpfForValidationAdapter: SendCpfForValidationAdapter
    ) = UpdateCustomerUseCase(
        findCustomerByIdUseCase,
        findAddressByZipCodeAdapter,
        updateCustomerAdapter,
        sendCpfForValidationAdapter
    )
}