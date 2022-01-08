package com.semihbkgr.example.springcloud.ping.processservice.component

import com.semihbkgr.example.springcloud.ping.models.Metric
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.exchange

@Service
class DefaultScheduleProcessor(val restTemplate: RestTemplate) : ScheduleProcessor {

    override fun send(domain: String, url: String): Metric {
        val sendTime = System.currentTimeMillis()
        val responseEntity: ResponseEntity<Map<String, Any>> =
            restTemplate.exchange(url, HttpMethod.GET, null, Map<String, Any>::javaClass)
        val response = if (responseEntity.body == null) emptyMap() else responseEntity.body
        val responseTime: Int = (System.currentTimeMillis() - sendTime).toInt()
        return Metric(
            domain,
            url,
            response!!,
            responseEntity.statusCode.value(),
            responseTime,
            sendTime
        )
    }

}