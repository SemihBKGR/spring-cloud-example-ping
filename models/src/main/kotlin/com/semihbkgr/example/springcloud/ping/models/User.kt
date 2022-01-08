package com.semihbkgr.example.springcloud.ping.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("user_entity")
data class User @JsonCreator constructor(
    @Id @JsonProperty("id") var id: String,
    @JsonProperty("username") var username: String,
    @JsonProperty("email") var email: String
)