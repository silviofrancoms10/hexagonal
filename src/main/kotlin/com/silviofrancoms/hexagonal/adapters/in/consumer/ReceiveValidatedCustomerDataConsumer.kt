package com.silviofrancoms.hexagonal.adapters.`in`.consumer

import com.silviofrancoms.hexagonal.adapters.`in`.consumer.message.CustomerMessage
import com.silviofrancoms.hexagonal.application.ports.`in`.UpdateCustomerInputPort
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class ReceiveValidatedCustomerDataConsumer(
    private val updateCustomerInputPort: UpdateCustomerInputPort
) {

    @KafkaListener(topics = ["tp-cpf-validated"], groupId = "silviofranco")
    fun receive(customerMessage: CustomerMessage){
        with(customerMessage){
        updateCustomerInputPort.update(toCustomer(), zipCode)
        }
    }

}