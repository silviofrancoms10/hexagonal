package com.silviofrancoms.hexagonal.application.ports.`in`

import com.silviofrancoms.hexagonal.application.core.domain.Customer

interface InsertCustomerInputPort {

    fun insert(customer: Customer, zipCode: String)
}