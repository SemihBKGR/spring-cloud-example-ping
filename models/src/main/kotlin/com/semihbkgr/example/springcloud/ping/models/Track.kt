package com.semihbkgr.example.springcloud.ping.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("tracks")
data class Track @JsonCreator constructor(
    @Id @JsonProperty("domain") var domain: String,
    @JsonProperty("metrics") var metrics: List<Metric>
)