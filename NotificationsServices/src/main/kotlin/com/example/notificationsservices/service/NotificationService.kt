package com.example.notificationsservices.service

import com.example.notificationsservices.model.Notification
import org.springframework.stereotype.Service

@Service
class NotificationService {

    fun sendNotification(notification: Notification) {
        // Implementar a lógica de envio de notificação
        when (notification.type) {
            "email" -> sendEmail(notification)
            "sms" -> sendSms(notification)
            "push" -> sendPushNotification(notification)
            else -> throw IllegalArgumentException("Tipo de notificação desconhecido: ${notification.type}")
        }
    }

    private fun sendEmail(notification: Notification) {
        // Simulação do envio de email
        println("Enviando email para ${notification.recipient} com a mensagem: ${notification.message}")
    }

    private fun sendSms(notification: Notification) {
        // Simulação do envio de SMS
        println("Enviando SMS para ${notification.recipient} com a mensagem: ${notification.message}")
    }

    private fun sendPushNotification(notification: Notification) {
        // Simulação do envio de notificação push
        println("Enviando notificação push para ${notification.recipient} com a mensagem: ${notification.message}")
    }
}