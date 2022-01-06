package com.semihbkgr.example.springcloud.ping.domainservice.service

import com.semihbkgr.example.springcloud.ping.models.Domain
import com.semihbkgr.example.springcloud.ping.models.dto.DomainSaveDto
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface DomainService {

    fun findByOwner(owner: String): Flux<Domain>

    fun findAll(page: UInt, size: UInt): Flux<Domain>

    fun save(domainDto: DomainSaveDto): Mono<Domain>

}