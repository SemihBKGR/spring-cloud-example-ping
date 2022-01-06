package com.semihbkgr.example.springcloud.ping.domainservice.service

import com.semihbkgr.example.springcloud.ping.models.Domain
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface DomainService {

    fun findByOwner(owner: String): Flux<Domain>

    fun save(domain:Domain): Mono<Domain>

}