package com.silviofrancoms.hexagonal.application.ports.out

import com.silviofrancoms.hexagonal.application.core.domain.Address

interface FindAddressByZipCodeOutputPort {
    fun find(zipCode: String): Address
}