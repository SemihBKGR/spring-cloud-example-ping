package com.semihbkgr.example.springcloud.ping.processservice.listener

import com.semihbkgr.example.springcloud.ping.processservice.component.ScheduleProcessor
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.support.KafkaHeaders
import org.springframework.messaging.handler.annotation.Header
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component

@Component
class ScheduleListener(val scheduleProcessor: ScheduleProcessor) {

    companion object {
        val log = LoggerFactory.getLogger(ScheduleListener::class.java)
    }

    @KafkaListener(topics = ["schedule"])
    fun processSchedule(
        @Payload message: String,
        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) key: String,
        @Header(KafkaHeaders.RECEIVED_PARTITION_ID) partition: Int
    ) {
        log.info("ScheduleListener - id: $key, url: $message")
        val metric = scheduleProcessor.send(message)
        
    }
}