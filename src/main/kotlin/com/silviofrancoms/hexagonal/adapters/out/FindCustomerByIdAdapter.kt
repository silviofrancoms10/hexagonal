package com.silviofrancoms.hexagonal.adapters.out

import com.silviofrancoms.hexagonal.adapters.out.repository.CustomerRepository
import com.silviofrancoms.hexagonal.application.core.domain.Customer
import com.silviofrancoms.hexagonal.application.ports.out.FindCustomerByIdOutputPort
import org.springframework.stereotype.Component
import kotlin.jvm.optionals.getOrNull

@Component
class FindCustomerByIdAdapter(
    private val customerRepository: CustomerRepository
): FindCustomerByIdOutputPort {
    override fun find(id: String): Customer? = customerRepository.findById(id).getOrNull().let {
            return it?.toCustomer()
        }
}