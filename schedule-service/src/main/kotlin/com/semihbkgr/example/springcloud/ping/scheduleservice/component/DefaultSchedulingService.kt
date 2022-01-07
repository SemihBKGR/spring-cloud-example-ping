package com.semihbkgr.example.springcloud.ping.scheduleservice.component

import com.semihbkgr.example.springcloud.ping.models.Schedule
import com.semihbkgr.example.springcloud.ping.scheduleservice.client.DomainClient
import com.semihbkgr.example.springcloud.ping.scheduleservice.service.ScheduleService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger

@Component
class DefaultSchedulingService(
    val domainClient: DomainClient,
    val scheduleService: ScheduleService,
    val kafkaTemplate: KafkaTemplate<String, String>
) :
    SchedulingService {

    companion object {

        @JvmStatic
        val log: Logger = LoggerFactory.getLogger(DefaultSchedulingService::class.java)

        @JvmStatic
        val page: AtomicInteger = AtomicInteger(0)

    }

    @Async
    @Scheduled(fixedRate = 1000, timeUnit = TimeUnit.MILLISECONDS)
    override fun start() {
        log.info("Starting")
        val domainList = domainClient.getAll(page.getAndIncrement().toUInt(), 100.toUInt())
        log.info("Domains - page: ${page.get()}, size: ${domainList.size}")
        if (domainList.isEmpty()) {
            page.set(0)
            return
        }
        val currentTime = System.currentTimeMillis()
        domainList.parallelStream()
            .forEach { domain ->
                log.info("${domain}, ${Thread.currentThread().name}")
                var schedule = scheduleService.findById(domain.id)
                if (schedule != null) {
                    if (domain.processTimeInterval > currentTime - schedule.lastProcessTime)
                        return@forEach
                    schedule.lastProcessTime = currentTime
                } else
                    schedule = Schedule(domain.id, currentTime)
                kafkaTemplate.send("schedule", domain.id, domain.url)
                scheduleService.save(schedule)
            }
    }

}