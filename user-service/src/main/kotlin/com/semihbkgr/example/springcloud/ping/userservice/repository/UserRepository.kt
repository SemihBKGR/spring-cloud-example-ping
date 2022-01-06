package com.semihbkgr.example.springcloud.ping.userservice.repository

import com.semihbkgr.example.springcloud.ping.models.User
import org.springframework.data.r2dbc.repository.R2dbcRepository
import reactor.core.publisher.Mono

interface UserRepository : R2dbcRepository<User, String> {

    fun findByUsername(username: String): Mono<User>

}