package com.silviofrancoms.hexagonal.config

import com.silviofrancoms.hexagonal.adapters.out.DeleteCustomerByIdAdapter
import com.silviofrancoms.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase
import com.silviofrancoms.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import com.silviofrancoms.hexagonal.application.ports.`in`.DeleteCustomerByIdInputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DeleteCustomerConfig {

    @Bean
    fun deleteCustomer(
        findCustomerByIdUseCase: FindCustomerByIdUseCase,
        deleteCustomerByIdAdapter: DeleteCustomerByIdAdapter
    ): DeleteCustomerByIdInputPort = DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter)

}