package com.semihbkgr.example.springcloud.ping.trackservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class TrackServiceApplication

fun main(args: Array<String>) {
    runApplication<TrackServiceApplication>(*args)
}
