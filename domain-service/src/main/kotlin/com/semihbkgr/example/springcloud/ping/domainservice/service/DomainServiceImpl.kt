package com.semihbkgr.example.springcloud.ping.domainservice.service

import com.semihbkgr.example.springcloud.ping.domainservice.component.UUIDGenerator
import com.semihbkgr.example.springcloud.ping.domainservice.repository.DomainRepository
import com.semihbkgr.example.springcloud.ping.models.Domain
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class DomainServiceImpl(val domainRepo: DomainRepository, val idGenerator: UUIDGenerator) : DomainService {

    override fun findByOwner(owner: String) = domainRepo.findByOwner(owner)

    override fun findAll(page: UInt, size: UInt) = domainRepo.findAllBy(PageRequest.of(page.toInt(), size.toInt()))

    override fun save(domain: Domain): Domain {
        domain.id = idGenerator.generate()
        return domainRepo.save(domain)
    }

}