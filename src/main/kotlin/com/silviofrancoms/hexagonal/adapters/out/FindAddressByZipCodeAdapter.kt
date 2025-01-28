package com.silviofrancoms.hexagonal.adapters.out

import com.silviofrancoms.hexagonal.adapters.out.client.FindAddressByZipCodeClient
import com.silviofrancoms.hexagonal.application.core.domain.Address
import com.silviofrancoms.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import org.springframework.stereotype.Component

@Component
class FindAddressByZipCodeAdapter(
    private val findAddressByZipCodeClient: FindAddressByZipCodeClient
) : FindAddressByZipCodeOutputPort {

    override fun find(zipCode: String): Address = findAddressByZipCodeClient.find(zipCode).toAddress()


}