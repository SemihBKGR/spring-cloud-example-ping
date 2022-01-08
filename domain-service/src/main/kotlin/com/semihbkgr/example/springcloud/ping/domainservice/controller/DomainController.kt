package com.semihbkgr.example.springcloud.ping.domainservice.controller

import com.semihbkgr.example.springcloud.ping.domainservice.service.DomainService
import com.semihbkgr.example.springcloud.ping.models.Domain
import com.semihbkgr.example.springcloud.ping.models.dto.DomainSaveDto
import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/domain")
class DomainController(val domainService: DomainService) {

    @GetMapping("/{owner}")
    fun getByOwner(@PathVariable("owner") owner: String) = domainService.findByOwner(owner)

    @GetMapping("/_")
    fun getAll(
        @RequestParam(value = "p", defaultValue = "0") p: UInt,
        @RequestParam(value = "s", defaultValue = "10") s: UInt
    ) = domainService.findAll(p, s)

    @PostMapping
    fun save(@RequestBody domainDto: DomainSaveDto, auth: Authentication): Domain {
        val domain = Domain(
            "",
            domainDto.url,
            domainDto.name,
            domainDto.description,
            true,
            domainDto.processTimeInterval,
            auth.name,
            System.currentTimeMillis()
        )
        return domainService.save(domain)
    }

}