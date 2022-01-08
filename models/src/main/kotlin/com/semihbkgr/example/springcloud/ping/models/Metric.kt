package com.semihbkgr.example.springcloud.ping.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Metric @JsonCreator constructor(
    @JsonProperty("url") var url: String,
    @JsonProperty("response") var response: Map<String, Any>,
    @JsonProperty("statusCode") var statusCode: Int,
    @JsonProperty("responseTime") var responseTime: Int,
    @JsonProperty("sentTime") var sentTime: Long
)