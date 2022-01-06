package com.semihbkgr.example.springcloud.ping.scheduleservice.client

import com.semihbkgr.example.springcloud.ping.models.Domain
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient("domain")
interface DomainClient {

    @GetMapping("/_")
    fun getAll(@RequestParam("p") i: UInt, @RequestParam("s") s: UInt): List<Domain>

}