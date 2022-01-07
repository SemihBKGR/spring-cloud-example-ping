package com.semihbkgr.example.springcloud.ping.communicationservice.controller

import com.semihbkgr.example.springcloud.ping.communicationservice.client.DomainClient
import com.semihbkgr.example.springcloud.ping.communicationservice.service.CommunicationService
import com.semihbkgr.example.springcloud.ping.models.Communication
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/communication")
class CommunicationController(
    val domainClient: DomainClient,
    val communicationService: CommunicationService
) {

    @GetMapping("/{domain-id}")
    fun getByDomainId(@PathVariable("domain-id") domainId: String, request: HttpServletRequest): Communication? {
        val domain = domainClient.get(domainId)
        if (domain != null) {
            val user = request.userPrincipal.name
            if (domain.owner == user) {
                return communicationService.findById(domainId)
            } else {
                throw IllegalStateException("User is not owner of domain")
            }
        } else
            throw IllegalArgumentException("No such domain")
    }

    @PostMapping
    fun save(@RequestBody communication: Communication, request: HttpServletRequest): Communication {
        val domain = domainClient.get(communication.domainId)
        if (domain != null) {
            val user = request.userPrincipal.name
            if (domain.owner == user) {
                return communicationService.save(communication)
            } else {
                throw IllegalStateException("User is not owner of domain")
            }
        } else
            throw IllegalArgumentException("No such domain")
    }

}