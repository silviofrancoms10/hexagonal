package com.silviofrancoms.hexagonal.application.ports.`in`

interface DeleteCustomerByIdInputPort {

    fun delete(id: String)
}