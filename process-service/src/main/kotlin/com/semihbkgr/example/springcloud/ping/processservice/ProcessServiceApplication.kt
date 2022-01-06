package com.semihbkgr.example.springcloud.ping.processservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProcessServiceApplication

fun main(args: Array<String>) {
    runApplication<ProcessServiceApplication>(*args)
}
