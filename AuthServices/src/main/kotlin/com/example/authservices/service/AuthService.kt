package com.example.authservices.service

import org.springframework.stereotype.Service

@Service
class AuthService {

    // Simulação de um banco de dados de usuários
    private val usersDatabase = mapOf(
        "user1" to "password1",
        "user2" to "password2"
    )

    fun authenticate(credentials: Map<String, String>): String {
        // Extrai o nome de usuário e senha dos credenciais
        val username = credentials["username"]
        val password = credentials["password"]

        // Valida se o nome de usuário e senha são válidos
        if (username != null && password != null) {
            val storedPassword = usersDatabase[username]
            if (storedPassword == password) {
                // Se as credenciais forem válidas, retorna um token de autenticação
                return generateToken(username)
            }
        }

        // Se as credenciais forem inválidas, retorna uma mensagem de erro
        throw IllegalArgumentException("Credenciais inválidas")
    }

    private fun generateToken(username: String): String {
        // Simula a geração de um token de autenticação
        return "Token-$username-${System.currentTimeMillis()}"
    }
}