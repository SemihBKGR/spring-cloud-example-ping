package com.semihbkgr.example.springcloud.ping.userservice.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("users")
data class User(
    @Id val id: Int,
    val username: String,
    val password: String,
    val email: String
)
