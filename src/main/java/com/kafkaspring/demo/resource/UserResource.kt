package com.kafkaspring.demo.resource

import com.kafkaspring.demo.Model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("kafka")

class UserResource {

    // Kafka Topic
    companion object {
        const val Topic = "KafkaSpring"
    }

    @Autowired
    private val kafkaTemplate: KafkaTemplate<String, String>? = null

    @GetMapping("/publish/{message}")
    fun post(@PathVariable("message") message: String): String {

        kafkaTemplate!!.send(Topic, message )
        return "Published Successfully"
    }

}
