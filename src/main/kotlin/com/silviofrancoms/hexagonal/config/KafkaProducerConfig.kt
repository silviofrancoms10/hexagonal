package com.silviofrancoms.hexagonal.config

import org.apache.kafka.clients.producer.ProducerConfig.BOOTSTRAP_SERVERS_CONFIG
import org.apache.kafka.clients.producer.ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG
import org.apache.kafka.clients.producer.ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.DefaultKafkaProducerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.core.ProducerFactory

@Configuration
class KafkaProducerConfig {
    private val configProps = mapOf(
        BOOTSTRAP_SERVERS_CONFIG to "localhost:9092",    //endereço do broker do kafka, pode ser colocado como PATH VARIABLE
        KEY_SERIALIZER_CLASS_CONFIG to StringSerializer::class.java, // a classe usada para fazer a serialização das chaves
        VALUE_SERIALIZER_CLASS_CONFIG to StringSerializer::class.java //classe utilizada para fazer a serialização do valor
    )

    @Bean
    fun producerFactory(): ProducerFactory<String, String> =
        DefaultKafkaProducerFactory(configProps)

    @Bean
    fun kafkaTemplate() = KafkaTemplate(producerFactory())
}