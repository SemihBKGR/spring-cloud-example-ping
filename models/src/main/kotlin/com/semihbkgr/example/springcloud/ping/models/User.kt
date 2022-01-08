package com.semihbkgr.example.springcloud.ping.models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("user_entity")
data class User(
    @Id var id: String,
    var username: String,
    var email: String
)