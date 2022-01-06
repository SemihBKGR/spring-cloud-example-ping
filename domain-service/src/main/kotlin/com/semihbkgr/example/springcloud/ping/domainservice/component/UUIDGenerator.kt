package com.semihbkgr.example.springcloud.ping.domainservice.component

import org.springframework.stereotype.Component
import java.util.*

@Component
class UUIDGenerator : IdGenerator<String> {

    override fun generate() = UUID.randomUUID().toString()

}