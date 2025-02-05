package com.silviofrancoms.hexagonal.application.ports.out

interface DeleteCustomerByIdOutputPort {

    fun delete(id: String)
}