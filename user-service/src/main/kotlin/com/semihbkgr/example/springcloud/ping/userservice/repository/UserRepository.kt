package com.semihbkgr.example.springcloud.ping.userservice.repository

import com.semihbkgr.example.springcloud.ping.userservice.model.User
import org.springframework.data.r2dbc.repository.R2dbcRepository
import reactor.core.publisher.Mono

interface UserRepository : R2dbcRepository<User, Int> {

    fun findByUsername(username: String): Mono<User>

}