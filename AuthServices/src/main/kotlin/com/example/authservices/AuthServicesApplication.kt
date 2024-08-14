package com.example.authservices

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class AuthServicesApplication

fun main(args: Array<String>) {
    runApplication<AuthServicesApplication>(*args)
}
