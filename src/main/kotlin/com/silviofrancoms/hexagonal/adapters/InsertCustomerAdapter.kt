package com.silviofrancoms.hexagonal.adapters

import com.silviofrancoms.hexagonal.adapters.out.repository.CustomerRepository
import com.silviofrancoms.hexagonal.adapters.out.repository.entity.CustomerEntity
import com.silviofrancoms.hexagonal.application.core.domain.Customer
import com.silviofrancoms.hexagonal.application.ports.out.InsertCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class InsertCustomerAdapter(
    private val customerRepository: CustomerRepository
) : InsertCustomerOutputPort {

    override fun insert(customer: Customer) {
        customerRepository.save(CustomerEntity(customer))
    }

}