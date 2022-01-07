package com.semihbkgr.example.springcloud.ping.communicationservice.client

import com.semihbkgr.example.springcloud.ping.models.Domain
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient("domain")
interface DomainClient {

    @GetMapping("/domain/{id}")
    fun get(@PathVariable("id") id: String): Domain?

}