# Projeto de Gerenciamento de Tarefas

Este projeto é uma aplicação de gerenciamento de tarefas utilizando arquitetura de microsserviços com Docker. O projeto é dividido em cinco microsserviços: Autenticação, Notificações, Tarefas, Configuração e Descoberta (Eureka).

---

**Requisitos:**
* Docker
* Gradle
* Java 17

---

## Como construir e executar os microsserviços

### 1. Construir os microsserviços

Para construir todos os microsserviços simultaneamente, execute na raiz do projeto:

 - Windows:
    ```bash
    ./gradlew.bat build
    ```
 - Linux/MacOS:
    ```bash
    ./gradlew build
    ```

### 2. Executar os microsserviços

Para iniciar os serviços com Docker Compose, execute na raiz do projeto:

```bash
  docker-compose up --build -d
```

___

## Informações Adicionais

- **Autenticação Service**: Lida com autenticação de usuários e emite tokens.

- **Notificações Service**: Envia notificações para os usuários.

- **Tarefas Service**: Gerencia as tarefas dos usuários.


Para mais detalhes sobre o funcionamento interno de cada microsserviço, consulte o código fonte em cada diretório de serviço.
