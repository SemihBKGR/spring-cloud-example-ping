package com.semihbkgr.example.springcloud.ping.domainservice.controller

import com.semihbkgr.example.springcloud.ping.domainservice.service.DomainService
import com.semihbkgr.example.springcloud.ping.models.Domain
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/domain")
class DomainController(val domainService: DomainService) {

    @GetMapping("/{owner}")
    fun getByOwner(@PathVariable("owner") owner: String): Flux<Domain> = domainService.findByOwner(owner)

    @PostMapping
    fun save(@RequestBody domain: Domain) = domainService.save(domain)

}