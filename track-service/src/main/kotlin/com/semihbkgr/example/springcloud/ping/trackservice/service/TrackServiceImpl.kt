package com.semihbkgr.example.springcloud.ping.trackservice.service

import com.semihbkgr.example.springcloud.ping.models.Metric
import com.semihbkgr.example.springcloud.ping.trackservice.repository.TrackRepository
import org.springframework.stereotype.Service

@Service
class TrackServiceImpl(val trackRepository: TrackRepository) : TrackService {

    override fun findById(id: String) = trackRepository.findById(id)

    override fun addMetric(id: String, metric: Metric) = trackRepository.addMetric(id, metric)

}