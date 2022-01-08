package com.semihbkgr.example.springcloud.ping.processservice.listener

import com.semihbkgr.example.springcloud.ping.processservice.client.TrackClient
import com.semihbkgr.example.springcloud.ping.processservice.component.ScheduleProcessor
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.support.KafkaHeaders
import org.springframework.messaging.handler.annotation.Header
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component

@Component
class ScheduleListener(
    val scheduleProcessor: ScheduleProcessor,
    val trackClient: TrackClient
) {

    companion object {
        val log: Logger = LoggerFactory.getLogger(ScheduleListener::class.java)
    }

    @KafkaListener(topics = ["schedule"])
    fun processSchedule(
        @Payload url: String,
        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) domain: String
    ) {
        log.info("ScheduleListener - id: $domain, url: $url")
        val metric = scheduleProcessor.send(url)
        trackClient.addMetric(domain, metric)
    }

}