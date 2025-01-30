package com.silviofrancoms.hexagonal.application.ports.out

import com.silviofrancoms.hexagonal.application.core.domain.Customer

interface FindCustomerByIdOutputPort {

    fun find(id: String): Customer?
}