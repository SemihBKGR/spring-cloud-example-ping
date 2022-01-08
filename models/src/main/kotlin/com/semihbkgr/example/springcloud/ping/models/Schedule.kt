package com.semihbkgr.example.springcloud.ping.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("schedules")
class Schedule(
    @Id var domain: String,
    var lastProcessTime: Long
)