package com.example.notificationsservices

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class NotificationsServicesApplication

fun main(args: Array<String>) {
    runApplication<NotificationsServicesApplication>(*args)
}
