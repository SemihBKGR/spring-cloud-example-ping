package com.semihbkgr.example.springcloud.ping.communicationservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class CommunicationServiceApplication

fun main(args: Array<String>) {
    runApplication<CommunicationServiceApplication>(*args)
}