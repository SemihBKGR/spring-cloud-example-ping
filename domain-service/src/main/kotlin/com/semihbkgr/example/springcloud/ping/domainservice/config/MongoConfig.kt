package com.semihbkgr.example.springcloud.ping.domainservice.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@Configuration
@EnableReactiveMongoAuditing
@EnableReactiveMongoRepositories(basePackages = ["com.semihbkgr.example.springcloud.ping.domainservice.repository"])
class MongoConfig