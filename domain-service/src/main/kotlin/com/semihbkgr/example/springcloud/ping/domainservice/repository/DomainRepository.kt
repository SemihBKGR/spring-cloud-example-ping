package com.semihbkgr.example.springcloud.ping.domainservice.repository

import com.semihbkgr.example.springcloud.ping.models.Domain
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface DomainRepository : MongoRepository<Domain, String> {

    fun findByOwner(owner: String): List<Domain>

    fun findAllBy(pageable: Pageable): List<Domain>

}