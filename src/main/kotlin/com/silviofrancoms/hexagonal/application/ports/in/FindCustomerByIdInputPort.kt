package com.silviofrancoms.hexagonal.application.ports.`in`

import com.silviofrancoms.hexagonal.application.core.domain.Customer

interface FindCustomerByIdInputPort {

    fun find(id: String): Customer
}