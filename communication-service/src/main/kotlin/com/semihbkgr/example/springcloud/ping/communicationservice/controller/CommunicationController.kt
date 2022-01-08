package com.semihbkgr.example.springcloud.ping.communicationservice.controller

import com.fasterxml.jackson.annotation.JsonProperty
import com.semihbkgr.example.springcloud.ping.communicationservice.client.DomainClient
import com.semihbkgr.example.springcloud.ping.communicationservice.service.CommunicationService
import com.semihbkgr.example.springcloud.ping.models.Communication
import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/communication")
class CommunicationController(
    @JsonProperty val domainClient: DomainClient,
    val communicationService: CommunicationService
) {

    @GetMapping("/{domain-id}")
    fun getByDomainId(@PathVariable("domain-id") domainId: String, auth: Authentication): Communication? {
        val domain = domainClient.get(domainId)
        if (domain != null) {
            val user = auth.name
            if (domain.owner == user) {
                return communicationService.findById(domainId)
            } else {
                throw IllegalStateException("User is not owner of the domain")
            }
        } else
            throw IllegalArgumentException("No such domain")
    }

    @PostMapping
    fun save(@RequestBody communication: Communication, auth: Authentication): Communication {
        val domain = domainClient.get(communication.domain)
        if (domain != null) {
            val user = auth.name
            if (domain.owner == user) {
                return communicationService.save(communication)
            } else {
                throw IllegalStateException("User is not owner of domain")
            }
        } else
            throw IllegalArgumentException("No such domain")
    }

}