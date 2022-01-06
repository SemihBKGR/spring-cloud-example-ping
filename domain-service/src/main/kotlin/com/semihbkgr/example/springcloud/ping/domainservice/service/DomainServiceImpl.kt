package com.semihbkgr.example.springcloud.ping.domainservice.service

import com.semihbkgr.example.springcloud.ping.domainservice.repository.DomainRepository
import com.semihbkgr.example.springcloud.ping.models.Domain
import org.springframework.stereotype.Service

@Service
class DomainServiceImpl(val domainRepo: DomainRepository) : DomainService {

    override fun findByOwner(owner: String) = domainRepo.findByOwner(owner)

    override fun save(domain: Domain) = domainRepo.save(domain)

}