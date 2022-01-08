package com.semihbkgr.example.springcloud.ping.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("communications")
data class Communication(
    @Id var domain: String,
    var emails: List<String>
)
