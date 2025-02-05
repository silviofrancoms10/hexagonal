package com.silviofrancoms.hexagonal.application.core.usecase

import com.silviofrancoms.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.silviofrancoms.hexagonal.application.ports.out.DeleteCustomerOutputPort

class DeleteCustomerByIdUseCase(
    private val findCustomerByIdInputPort: FindCustomerByIdInputPort,
    private val deleteCustomerOutputPort: DeleteCustomerOutputPort
) {

    fun delete(id: String) {
        findCustomerByIdInputPort.find(id)
        deleteCustomerOutputPort.delete(id)
    }
}