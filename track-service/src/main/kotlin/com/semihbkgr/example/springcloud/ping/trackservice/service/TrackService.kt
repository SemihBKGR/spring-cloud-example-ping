package com.semihbkgr.example.springcloud.ping.trackservice.service

import com.semihbkgr.example.springcloud.ping.models.Metric
import com.semihbkgr.example.springcloud.ping.models.Track
import reactor.core.publisher.Mono

interface TrackService {

    fun findById(id: String): Mono<Track>

    fun addMetric(id: String, metric: Metric)

}