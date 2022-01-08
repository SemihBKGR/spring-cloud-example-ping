package com.semihbkgr.example.springcloud.ping.trackservice.repository

import com.semihbkgr.example.springcloud.ping.models.Track
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface TrackRepository : ReactiveMongoRepository<Track, String>