package com.example.notificationsservices.model

data class Notification(
    val id: Long,
    val recipient: String,
    val message: String,
    val type: String // "email", "sms", "push"
)