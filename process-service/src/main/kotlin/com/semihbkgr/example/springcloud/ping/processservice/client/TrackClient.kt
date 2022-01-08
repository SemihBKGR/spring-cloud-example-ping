package com.semihbkgr.example.springcloud.ping.processservice.client

import com.semihbkgr.example.springcloud.ping.models.Metric
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient("track")
interface TrackClient {

    @PostMapping("/track/metric/{domain}")
    fun addMetric(@PathVariable("domain") domain: String, @RequestBody metric: Metric)

}