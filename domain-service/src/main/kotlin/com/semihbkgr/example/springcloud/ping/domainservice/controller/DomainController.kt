package com.semihbkgr.example.springcloud.ping.domainservice.controller

import com.semihbkgr.example.springcloud.ping.domainservice.service.DomainService
import com.semihbkgr.example.springcloud.ping.models.Domain
import com.semihbkgr.example.springcloud.ping.models.dto.DomainSaveDto
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/domain")
class DomainController(val domainService: DomainService) {

    @GetMapping("/{owner}")
    fun getByOwner(@PathVariable("owner") owner: String): Flux<Domain> = domainService.findByOwner(owner)

    @GetMapping("/_")
    fun getAll(
        @RequestParam(value = "p", defaultValue = "0") p: UInt,
        @RequestParam(value = "s", defaultValue = "10") s: UInt
    ) = domainService.findAll(p, s)

    @PostMapping
    fun save(@RequestBody domainDto: DomainSaveDto) = domainService.save(domainDto)

}