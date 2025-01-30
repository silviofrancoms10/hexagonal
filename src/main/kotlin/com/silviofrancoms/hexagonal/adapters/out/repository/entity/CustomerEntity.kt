package com.silviofrancoms.hexagonal.adapters.out.repository.entity

import com.silviofrancoms.hexagonal.application.core.domain.Address
import com.silviofrancoms.hexagonal.application.core.domain.Customer
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId

@Document(collection = "customers")
data class CustomerEntity(
    @MongoId val id: String?,
    val name: String,
    val address: AddressEntity,
    val cpf: String,
    val isValidCpf: Boolean
) {
    constructor(customer: Customer) : this(
        id = customer.id,
        name = customer.name,
        address = AddressEntity(customer.address!!),
        cpf = customer.cpf,
        isValidCpf = customer.isValidCpf
    )

    fun toCustomer() = Customer(id, name, address.toAddress(), cpf, isValidCpf)
}
