package com.silviofrancoms.hexagonal.adapters.out

import com.silviofrancoms.hexagonal.adapters.out.repository.CustomerRepository
import com.silviofrancoms.hexagonal.adapters.out.repository.entity.CustomerEntity
import com.silviofrancoms.hexagonal.application.core.domain.Customer
import com.silviofrancoms.hexagonal.application.ports.out.UpdateCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class UpdateCustomerAdapter(
    private val customerRepository: CustomerRepository
) : UpdateCustomerOutputPort {

    override fun update(customer: Customer) {
        customerRepository.save(CustomerEntity(customer))
    }
}