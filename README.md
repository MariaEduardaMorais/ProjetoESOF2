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

[//]: # ()
[//]: # (### 1. Autenticação Service)

[//]: # ()
[//]: # (- Navegue até o diretório `AuthServices`:)

[//]: # ()
[//]: # (    - **Windows/macOS/Linux:** `cd ProjetoESOF2/AuthServices`)

[//]: # ()
[//]: # (- Construa o JAR do serviço:)

[//]: # ()
[//]: # (    - **Windows:** `.\gradlew.bat build`)

[//]: # (    - **macOS/Linux:** `./gradlew build`)

[//]: # ()
[//]: # (  **Observação:** Em sistemas Unix &#40;macOS/Linux&#41;, pode ser necessário garantir que o arquivo `gradlew` tenha permissão de execução. Para fazer isso, execute o seguinte comando:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    chmod +x gradlew)

[//]: # (    ```)

[//]: # ()
[//]: # (- Construa a imagem Docker:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    docker build -t auth-service:latest .)

[//]: # (    ```)

[//]: # ()
[//]: # (- Execute o container:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    docker run -p 8081:8081 auth-service:latest)

[//]: # (    ```)

[//]: # ()
[//]: # (---)

[//]: # ()
[//]: # (### 2. Notificações Service)

[//]: # ()
[//]: # (- Navegue até o diretório `NotificationsServices`:)

[//]: # ()
[//]: # (    - **Windows/macOS/Linux:** `cd ProjetoESOF2/NotificationsServices`)

[//]: # ()
[//]: # (- Construa o JAR do serviço:)

[//]: # ()
[//]: # (    - **Windows:** `.\gradlew.bat build`)

[//]: # (    - **macOS/Linux:** `./gradlew build`)

[//]: # ()
[//]: # (  **Observação:** Em sistemas Unix &#40;macOS/Linux&#41;, pode ser necessário garantir que o arquivo `gradlew` tenha permissão de execução. Para fazer isso, execute o seguinte comando:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    chmod +x gradlew)

[//]: # (    ```)

[//]: # ()
[//]: # (- Construa a imagem Docker:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    docker build -t notification-service:latest .)

[//]: # (    ```)

[//]: # ()
[//]: # (- Execute o container:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    docker run -p 8082:8082 notification-service:latest)

[//]: # (    ```)

[//]: # ()
[//]: # (---)

[//]: # ()
[//]: # (### 3. Tarefas Service)

[//]: # ()
[//]: # (- Navegue até o diretório `TaskService`:)

[//]: # ()
[//]: # (    - **Windows/macOS/Linux:** `cd ProjetoESOF2/TaskService`)

[//]: # ()
[//]: # (- Construa o JAR do serviço:)

[//]: # ()
[//]: # (    - **Windows:** `.\gradlew.bat build`)

[//]: # (    - **macOS/Linux:** `./gradlew build`)

[//]: # ()
[//]: # (  **Observação:** Em sistemas Unix &#40;macOS/Linux&#41;, pode ser necessário garantir que o arquivo `gradlew` tenha permissão de execução. Para fazer isso, execute o seguinte comando:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    chmod +x gradlew)

[//]: # (    ```)

[//]: # ()
[//]: # (- Construa a imagem Docker:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    docker build -t task-service:latest .)

[//]: # (    ```)

[//]: # ()
[//]: # (- Execute o container:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    docker run -p 8083:8083 task-service:latest)

[//]: # (    ```)

[//]: # ()
[//]: # (---)

[//]: # ()
[//]: # (### 4. Configuração e Descoberta)

[//]: # ()
[//]: # (#### 4.1 ConfigServer &#40;Configuração&#41;)

[//]: # ()
[//]: # (- Navegue até o diretório `ConfigServer`:)

[//]: # ()
[//]: # (    - **Windows/macOS/Linux:** `cd ProjetoESOF2/ConfigServer`)

[//]: # ()
[//]: # (- Construa o JAR do serviço:)

[//]: # ()
[//]: # (    - **Windows:** `.\gradlew.bat build`)

[//]: # (    - **macOS/Linux:** `./gradlew build`)

[//]: # ()
[//]: # (  **Observação:** Em sistemas Unix &#40;macOS/Linux&#41;, pode ser necessário garantir que o arquivo `gradlew` tenha permissão de execução. Para fazer isso, execute o seguinte comando:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    chmod +x gradlew)

[//]: # (    ```)

[//]: # ()
[//]: # (- Construa a imagem Docker:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    docker build -t config-server:latest .)

[//]: # (    ```)

[//]: # ()
[//]: # (- Execute o container:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    docker run -p 8888:8888 config-server:latest)

[//]: # (    ```)

[//]: # ()
[//]: # (#### 4.2 EurekaServer &#40;Descoberta&#41;)

[//]: # ()
[//]: # (- Navegue até o diretório `DiscoveryServer`:)

[//]: # ()
[//]: # (    - **Windows/macOS/Linux:** `cd ProjetoESOF2/DiscoveryServer`)

[//]: # ()
[//]: # (- Construa o JAR do serviço:)

[//]: # ()
[//]: # (    - **Windows:** `.\gradlew.bat build`)

[//]: # (    - **macOS/Linux:** `./gradlew build`)

[//]: # ()
[//]: # (  **Observação:** Em sistemas Unix &#40;macOS/Linux&#41;, pode ser necessário garantir que o arquivo `gradlew` tenha permissão de execução. Para fazer isso, execute o seguinte comando:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    chmod +x gradlew)

[//]: # (    ```)

[//]: # ()
[//]: # (- Construa a imagem Docker:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    docker build -t eureka-server:latest .)

[//]: # (    ```)

[//]: # ()
[//]: # (- Execute o container:)

[//]: # ()
[//]: # (    ```bash)

[//]: # (    docker run -p 8761:8761 eureka-server:latest)

[//]: # (    ```)
[//]: # ()
[//]: # (---)


Para construir e executar todos os microsserviços, você pode usar o Docker Compose. O Docker Compose cuidará da construção e execução de todos os microsserviços simultaneamente.


- Para iniciar os serviços com Docker Compose, execute na raiz do projeto:

    ```bash
    docker-compose up --build
    ```

___

## Informações Adicionais

- **Autenticação Service**: Lida com autenticação de usuários e emite tokens.

- **Notificações Service**: Envia notificações para os usuários.

- **Tarefas Service**: Gerencia as tarefas dos usuários.


Para mais detalhes sobre o funcionamento interno de cada microsserviço, consulte o código fonte em cada diretório de serviço.
