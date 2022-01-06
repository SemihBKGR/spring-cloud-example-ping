package com.semihbkgr.example.springcloud.ping.userservice.controller

import com.semihbkgr.example.springcloud.ping.userservice.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(val userService: UserService) {

    @GetMapping("/{username}")
    fun getByUsername(@PathVariable username: String) = userService.findByUsername(username)

}