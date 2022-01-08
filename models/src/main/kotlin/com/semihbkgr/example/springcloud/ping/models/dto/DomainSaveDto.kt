package com.semihbkgr.example.springcloud.ping.models.dto

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class DomainSaveDto @JsonCreator constructor(
    @JsonProperty("url") val url: String,
    @JsonProperty("name") val name: String?,
    @JsonProperty("description") val description: String?,
    @JsonProperty("processTimeInterval") val processTimeInterval: Long,
)
