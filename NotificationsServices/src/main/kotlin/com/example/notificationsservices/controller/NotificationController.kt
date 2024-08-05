package com.example.notificationsservices.controller

import com.example.notificationsservices.model.Notification
import com.example.notificationsservices.service.NotificationService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/notifications")
class NotificationController(private val notificationService: NotificationService) {

    @PostMapping
    fun sendNotification(@RequestBody notification: Notification): String {
        notificationService.sendNotification(notification)
        return "Notificação enviada"
    }
}