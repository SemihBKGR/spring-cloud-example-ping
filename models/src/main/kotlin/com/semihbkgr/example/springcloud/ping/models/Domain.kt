package com.semihbkgr.example.springcloud.ping.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("domains")
data class Domain(
    @Id var id: String,
    var url: String,
    var name: String?,
    var description: String?,
    var enabled: Boolean,
    var processTimeInterval: Long,
    var owner: String,
    var creationTime: Long
)
