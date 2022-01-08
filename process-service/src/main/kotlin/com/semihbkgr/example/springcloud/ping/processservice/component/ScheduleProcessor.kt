package com.semihbkgr.example.springcloud.ping.processservice.component

import com.semihbkgr.example.springcloud.ping.models.Metric

interface ScheduleProcessor {

    fun send(domain: String, url: String): Metric

}