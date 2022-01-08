package com.semihbkgr.example.springcloud.ping.processservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class ProcessServiceApplication

fun main(args: Array<String>) {
    runApplication<ProcessServiceApplication>(*args)
}
