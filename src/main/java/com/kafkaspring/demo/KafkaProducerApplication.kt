package com.kafkaspring.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object KafkaProducerApplication {
    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(KafkaProducerApplication::class.java, *args)
    }
}
