package com.semihbkgr.example.springcloud.ping.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("communications")
data class Communication(
    @Id @Field("domain_id") val domainId: String,
    val emails: List<String>
)
