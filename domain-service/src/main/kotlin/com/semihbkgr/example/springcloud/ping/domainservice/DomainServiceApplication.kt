package com.semihbkgr.example.springcloud.ping.domainservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class DomainServiceApplication

fun main(args: Array<String>) {
    runApplication<DomainServiceApplication>(*args)
}