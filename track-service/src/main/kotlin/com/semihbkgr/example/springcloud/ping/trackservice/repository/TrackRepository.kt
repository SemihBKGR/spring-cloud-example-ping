package com.semihbkgr.example.springcloud.ping.trackservice.repository

import com.semihbkgr.example.springcloud.ping.models.Metric
import com.semihbkgr.example.springcloud.ping.models.Track
import reactor.core.publisher.Mono

interface TrackRepository {

    fun findById(id: String): Mono<Track>

    fun addMetric(id: String, metric: Metric): Mono<Unit>

    companion object {
        const val COLLECTION_NAME: String = "tracks"
    }

}