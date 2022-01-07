package com.semihbkgr.example.springcloud.ping.scheduleservice.service

import com.semihbkgr.example.springcloud.ping.models.Schedule
import com.semihbkgr.example.springcloud.ping.scheduleservice.repository.ScheduleRepository
import org.springframework.stereotype.Service

@Service
class ScheduleServiceImpl(val scheduleRepository: ScheduleRepository) : ScheduleService {

    override fun findById(id: String): Schedule? = scheduleRepository.findById(id).orElseGet { null }

    override fun save(schedule: Schedule) = scheduleRepository.save(schedule)

}