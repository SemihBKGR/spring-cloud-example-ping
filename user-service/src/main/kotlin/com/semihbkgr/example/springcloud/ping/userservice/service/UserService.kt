package com.semihbkgr.example.springcloud.ping.userservice.service

import com.semihbkgr.example.springcloud.ping.userservice.model.User
import reactor.core.publisher.Mono

interface UserService {

    fun findByUsername(username: String): Mono<User>

}