package com.silviofrancoms.hexagonal.config

import com.silviofrancoms.hexagonal.adapters.out.FindCustomerByIdAdapter
import com.silviofrancoms.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FindCustomerByIdConfig {

    @Bean
    fun findCustomerById(findCustomerByIdAdapter: FindCustomerByIdAdapter) =
        FindCustomerByIdUseCase(findCustomerByIdAdapter)
}