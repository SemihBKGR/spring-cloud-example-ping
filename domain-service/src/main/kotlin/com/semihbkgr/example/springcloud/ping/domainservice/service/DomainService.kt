package com.semihbkgr.example.springcloud.ping.domainservice.service

import com.semihbkgr.example.springcloud.ping.models.Domain

interface DomainService {

    fun findByOwner(owner: String): List<Domain>

    fun findAll(page: UInt, size: UInt): List<Domain>

    fun save(domain: Domain): Domain

}