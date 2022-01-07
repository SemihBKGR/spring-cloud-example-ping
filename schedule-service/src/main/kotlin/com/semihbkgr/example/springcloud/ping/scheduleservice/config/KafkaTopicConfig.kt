package com.semihbkgr.example.springcloud.ping.scheduleservice.config

import org.apache.kafka.clients.admin.AdminClientConfig
import org.apache.kafka.clients.admin.NewTopic
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.KafkaAdmin

@Configuration
class KafkaTopicConfig {

    @Bean
    fun kafkaAdmin(@Value("\${spring.kafka.producer.bootstrap-server}") bootstrapServer: String): KafkaAdmin {
        val config = mutableMapOf<String, Any>()
        config[AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG] = bootstrapServer
        return KafkaAdmin(config)
    }

    @Bean
    fun scheduleTopic(
        @Value("\${spring.kafka.producer.topic.schedule.name}") name: String,
        @Value("\${spring.kafka.producer.topic.schedule.partitions}") partitions: Int,
        @Value("\${spring.kafka.producer.topic.schedule.replication-factor}") replicationFactor: Short
    ): NewTopic {
        return NewTopic(name, partitions, replicationFactor)
    }

}