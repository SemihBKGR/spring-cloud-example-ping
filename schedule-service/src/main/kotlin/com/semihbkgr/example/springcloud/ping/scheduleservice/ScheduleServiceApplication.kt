package com.semihbkgr.example.springcloud.ping.scheduleservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableAsync
@EnableScheduling
class ScheduleServiceApplication

fun main(args: Array<String>) {
    runApplication<ScheduleServiceApplication>(*args)
    Thread.currentThread().join()
}