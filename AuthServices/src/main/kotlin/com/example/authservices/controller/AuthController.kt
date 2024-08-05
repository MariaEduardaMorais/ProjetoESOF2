package com.example.authservices.controller

import com.example.authservices.service.AuthService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/auth")
class AuthController(private val authService: AuthService) {

    @PostMapping("/login")
    fun login(@RequestBody credentials: Map<String, String>): String {
        return authService.authenticate(credentials)
    }
}