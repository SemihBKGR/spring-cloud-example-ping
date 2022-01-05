package com.semihbkgr.example.springcloud.ping.userservice.controller

import com.semihbkgr.example.springcloud.ping.userservice.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val userService: UserService) {

    @GetMapping("/{username}")
    fun getUser(@PathVariable("username") username: String) = userService.findByUsername(username)

}