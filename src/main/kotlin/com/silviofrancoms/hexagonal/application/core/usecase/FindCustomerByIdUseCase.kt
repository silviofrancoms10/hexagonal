package com.silviofrancoms.hexagonal.application.core.usecase

import com.silviofrancoms.hexagonal.application.core.domain.Customer
import com.silviofrancoms.hexagonal.application.core.exceptions.ObjectNotFoundException
import com.silviofrancoms.hexagonal.application.ports.out.FindCustomerByIdOutputPort

class FindCustomerByIdUseCase(
    private val findCustomerByIdOutputPort: FindCustomerByIdOutputPort
) {

    fun find(id: String): Customer{
        return findCustomerByIdOutputPort.find(id) ?: throw ObjectNotFoundException("Customer not found")
    }
}