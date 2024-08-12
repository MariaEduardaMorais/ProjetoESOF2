# Projeto de Gerenciamento de Tarefas

Este projeto é uma aplicação de gerenciamento de tarefas utilizando arquitetura de microsserviços com Docker. O projeto é dividido em cinco microsserviços: Autenticação, Notificações, Tarefas, Configuração e Descoberta (Eureka).

## Estrutura do projeto

``` plaintext
ProjetoESOF2/
├── AuthServices/
│   ├── src/
│   ├── build.gradle.kts
│   ├── Dockerfile
│   └── ...
├── ConfigServer/
│   ├── src/
│   ├── build.gradle.kts
│   ├── Dockerfile
│   └── ...
├── DiscoveryServer/
│   ├── src/
│   ├── build.gradle.kts
│   ├── Dockerfile
│   └── ...
├── NotificationsServices/
│   ├── src/
│   ├── build.gradle.kts
│   ├── Dockerfile
│   └── ...
├── TaskService/
│   ├── src/
│   ├── build.gradle.kts
│   ├── Dockerfile
│   └── ...
└── docker-compose.yml
```

---

**Requisitos:**
* Docker
* Gradle
* Java 17

---

## Como construir e executar os microsserviços

Para construir e executar todos os microsserviços, você pode usar o Docker Compose. O Docker Compose cuidará da construção e execução de todos os microsserviços simultaneamente.


- Para iniciar os serviços com Docker Compose, execute na raiz do projeto:

    ```bash
    docker-compose up --build -d
    ```

___

## Informações Adicionais

- **Autenticação Service**: Lida com autenticação de usuários e emite tokens.

- **Notificações Service**: Envia notificações para os usuários.

- **Tarefas Service**: Gerencia as tarefas dos usuários.


Para mais detalhes sobre o funcionamento interno de cada microsserviço, consulte o código fonte em cada diretório de serviço.
