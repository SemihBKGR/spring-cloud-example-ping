package com.semihbkgr.example.springcloud.ping.userservice.service

import com.semihbkgr.example.springcloud.ping.userservice.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val userRepo: UserRepository) : UserService {

    override fun findByUsername(username: String) = userRepo.findByUsername(username)

}