package com.semihbkgr.example.springcloud.ping.models.dto

data class DomainSaveDto(
    val url: String,
    val name: String?,
    val description: String?,
    val processTimeInterval: Long,
)
