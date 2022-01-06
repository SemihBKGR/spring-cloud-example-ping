package com.semihbkgr.example.springcloud.ping.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("schedules")
class Schedule(
    @Id @Field(name = "domain_id") val domainId: String,
    var lastProcessTime: Long
)