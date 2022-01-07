package com.semihbkgr.example.springcloud.ping.scheduleservice.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@Configuration
@EnableMongoRepositories(basePackages = ["com.semihbkgr.example.springcloud.ping.scheduleservice.repository"])
class MongoConfig