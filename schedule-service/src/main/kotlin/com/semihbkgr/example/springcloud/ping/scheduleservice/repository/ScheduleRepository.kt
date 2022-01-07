package com.semihbkgr.example.springcloud.ping.scheduleservice.repository

import com.semihbkgr.example.springcloud.ping.models.Schedule
import org.springframework.data.mongodb.repository.MongoRepository

interface ScheduleRepository : MongoRepository<Schedule, String>