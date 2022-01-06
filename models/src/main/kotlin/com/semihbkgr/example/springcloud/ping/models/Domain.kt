package com.semihbkgr.example.springcloud.ping.models

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document("domains")
data class Domain(
    @Id val id: String,
    @Indexed(unique = true) val url: String,
    var name: String?,
    var description: String?,
    var enabled: Boolean,
    var processTimeInterval: Long,
    @CreatedBy var owner: String,
    @CreatedDate var creationTime: Long
)
