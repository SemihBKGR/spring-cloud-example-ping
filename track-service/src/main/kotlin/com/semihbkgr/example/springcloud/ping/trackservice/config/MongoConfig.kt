package com.semihbkgr.example.springcloud.ping.trackservice.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@Configuration
@EnableReactiveMongoRepositories(basePackages = ["com.semihbkgr.example.springcloud.ping.trackservice.repository"])
class MongoConfig