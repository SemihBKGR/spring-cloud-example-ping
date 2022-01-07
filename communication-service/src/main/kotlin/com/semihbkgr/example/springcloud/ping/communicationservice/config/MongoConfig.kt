package com.semihbkgr.example.springcloud.ping.communicationservice.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@EnableMongoRepositories(basePackages = ["com.semihbkgr.example.springcloud.ping.communicationservice.repository"])
class MongoConfig
