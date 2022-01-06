package com.semihbkgr.example.springcloud.ping.domainservice.component

interface IdGenerator<T> {

    fun generate(): T

}