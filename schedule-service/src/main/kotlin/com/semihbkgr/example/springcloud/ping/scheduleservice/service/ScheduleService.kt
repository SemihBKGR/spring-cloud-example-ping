package com.semihbkgr.example.springcloud.ping.scheduleservice.service

import com.semihbkgr.example.springcloud.ping.models.Schedule

interface ScheduleService {

    fun findById(id: String): Schedule?

    fun save(schedule: Schedule): Schedule

}