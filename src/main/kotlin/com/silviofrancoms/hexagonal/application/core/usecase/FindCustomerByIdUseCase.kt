package com.silviofrancoms.hexagonal.application.core.usecase

import com.silviofrancoms.hexagonal.application.core.exceptions.ObjectNotFoundException
import com.silviofrancoms.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.silviofrancoms.hexagonal.application.ports.out.FindCustomerByIdOutputPort

class FindCustomerByIdUseCase(
    private val findCustomerByIdOutputPort: FindCustomerByIdOutputPort
):FindCustomerByIdInputPort {

    override fun find(id: String) =
        findCustomerByIdOutputPort.find(id) ?: throw ObjectNotFoundException("Customer not found")
}