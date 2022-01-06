package com.semihbkgr.example.springcloud.ping.domainservice.repository

import com.semihbkgr.example.springcloud.ping.models.Domain
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Flux

interface DomainRepository : ReactiveMongoRepository<Domain, String> {

    fun findByOwner(owner: String): Flux<Domain>

}