package com.semihbkgr.example.springcloud.ping.domainservice.config

import com.semihbkgr.example.springcloud.ping.models.Domain
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@EnableMongoAuditing
@EnableMongoRepositories(basePackageClasses = [Domain::class])
class MongoConfig