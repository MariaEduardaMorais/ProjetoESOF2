# Projeto de Gerenciamento de Tarefas

Este projeto é uma aplicação de gerenciamento de tarefas utilizando arquitetura de microsserviços com Docker. O projeto é dividido em cinco microsserviços: Autenticação, Notificações, Tarefas, Configuração e Descoberta (Eureka).

---

**Requisitos:**

Antes de iniciar, certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

* Docker
* Docker Compose
* Kotlin
* Gradle
* Java 17

---

## Clonar o repositório

Para clonar o repositório, execute o seguinte comando:

```bash
git clone https://github.com/MariaEduardaMorais/ProjetoESOF2.git
```

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

- **Configuração Service**: Centraliza as configurações dos microsserviços.

- **Discovery Server**: Servidor de descoberta de serviços.


Para mais detalhes sobre o funcionamento interno de cada microsserviço, consulte o código fonte em cada diretório de serviço.
