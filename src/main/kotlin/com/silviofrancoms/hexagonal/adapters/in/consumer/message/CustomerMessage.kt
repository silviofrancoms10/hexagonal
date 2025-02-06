package com.silviofrancoms.hexagonal.adapters.`in`.consumer.message

data class CustomerMessage (
    val id: String,
    val name: String,
    val zipCode: String,
    val cpf: String,
    val isValidCpf: Boolean
)