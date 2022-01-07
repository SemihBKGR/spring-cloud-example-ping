package com.semihbkgr.example.springcloud.ping.communicationservice.service

import com.semihbkgr.example.springcloud.ping.communicationservice.repository.CommunicationRepository
import com.semihbkgr.example.springcloud.ping.models.Communication
import org.springframework.stereotype.Service

@Service
class CommunicationServiceImpl(val communicationRepo: CommunicationRepository) : CommunicationService {

    override fun findById(id: String): Communication? = communicationRepo.findById(id).orElseGet { null }

    override fun save(communication: Communication) = communicationRepo.save(communication)

}