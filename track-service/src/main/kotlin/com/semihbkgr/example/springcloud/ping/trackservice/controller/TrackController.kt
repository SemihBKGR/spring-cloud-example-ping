package com.semihbkgr.example.springcloud.ping.trackservice.controller

import com.semihbkgr.example.springcloud.ping.models.Metric
import com.semihbkgr.example.springcloud.ping.trackservice.service.TrackService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/track")
class TrackController(val trackService: TrackService) {

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: String) = trackService.findById(id)

    @PostMapping("/metric/{domain}")
    fun addMetric(
        @PathVariable("domain") domain: String,
        @RequestBody metric: Metric
    ) = trackService.addMetric(domain, metric)

}