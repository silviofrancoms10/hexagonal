package com.silviofrancoms.hexagonal.application.ports.`in`

import com.silviofrancoms.hexagonal.application.core.domain.Customer

interface UpdateCustomerInputPort {

    fun update(customer: Customer, zipCode: String)
    
}