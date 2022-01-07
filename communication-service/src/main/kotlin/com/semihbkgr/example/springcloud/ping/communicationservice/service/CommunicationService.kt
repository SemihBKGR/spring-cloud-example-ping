package com.semihbkgr.example.springcloud.ping.communicationservice.service

import com.semihbkgr.example.springcloud.ping.models.Communication

interface CommunicationService {

    fun findById(id: String): Communication?

    fun save(communication: Communication): Communication

}