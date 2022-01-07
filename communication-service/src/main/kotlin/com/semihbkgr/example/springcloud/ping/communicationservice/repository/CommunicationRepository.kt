package com.semihbkgr.example.springcloud.ping.communicationservice.repository

import com.semihbkgr.example.springcloud.ping.models.Communication
import org.springframework.data.mongodb.repository.MongoRepository

interface CommunicationRepository : MongoRepository<Communication, String>