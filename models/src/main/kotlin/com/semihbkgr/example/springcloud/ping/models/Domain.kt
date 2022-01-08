package com.semihbkgr.example.springcloud.ping.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("domains")
data class Domain @JsonCreator constructor(
    @Id @JsonProperty("id") var id: String,
    @JsonProperty("url") var url: String,
    @JsonProperty("name") var name: String?,
    @JsonProperty("description") var description: String?,
    @JsonProperty("enabled") var enabled: Boolean,
    @JsonProperty("processTimeInterval") var processTimeInterval: Long,
    @JsonProperty("owner") var owner: String,
    @JsonProperty("creationTime") var creationTime: Long
)
