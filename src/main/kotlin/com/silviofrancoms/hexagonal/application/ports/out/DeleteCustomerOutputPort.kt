package com.silviofrancoms.hexagonal.application.ports.out

interface DeleteCustomerOutputPort {

    fun delete(id: String)
}