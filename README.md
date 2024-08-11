# **Projeto de Gerenciamento de Tarefas**


Este projeto é uma aplicação de gerenciamento de tarefas utilizando arquitetura de microsserviços com Docker. O projeto é dividido em três microsserviços: Autenticação, Notificações e Tarefas.

-> Estrutura do Projeto

ProjetoESOF2/
├── AuthServices/
│   ├── src/
│   ├── build.gradle.kts
│   ├── Dockerfile
│   └── ...
├── NotificationsServices/
│   ├── src/
│   ├── build.gradle.kts
│   ├── Dockerfile
│   └── ...
└── TaskService/
    ├── src/
    ├── build.gradle.kts
    ├── Dockerfile
    └── ...
____________________________________________________________________________________________________________________________________________________________________________________________________

**Requisitos:**
* Docker
* Gradle
____________________________________________________________________________________________________________________________________________________________________________________________________

### **Como Construir e Executar os Microsserviços**

**1. Autenticação Service**
   
-> Navegue até o diretório AuthServices:
cd C:\IdeaProjects\ProjetoESOF2\AuthServices

-> Construa o JAR do serviço:
.\gradlew.bat build

-> Construa a imagem Docker:
docker build -t auth-service:latest .

-> Execute o container:
docker run -p 8081:8081 auth-service:latest

____________________________________________________________________________________________________________________________________________________________________________________________________

**2. Notificações Service**
   
-> Navegue até o diretório NotificationsServices:
cd C:\IdeaProjects\ProjetoESOF2\NotificationsServices

-> Construa o JAR do serviço:
.\gradlew.bat build

-> Construa a imagem Docker:
docker build -t notification-service:latest .

-> Execute o container:
docker run -p 8082:8082 notification-service:latest

____________________________________________________________________________________________________________________________________________________________________________________________________

**3. Tarefas Service**

-> Navegue até o diretório TaskService:
cd C:\IdeaProjects\ProjetoESOF2\TaskService

-> Construa o JAR do serviço:
.\gradlew.bat build

-> Construa a imagem Docker:
docker build -t task-service:latest .

-> Execute o container:
docker run -p 8083:8083 task-service:latest

____________________________________________________________________________________________________________________________________________________________________________________________________

**Docker Compose**

Você também pode usar o Docker Compose para construir e rodar todos os microsserviços juntos. Crie um arquivo docker-compose.yml no diretório raiz do projeto com o seguinte conteúdo:

version: '3'
services:
  auth-service:
    build:
      context: ./AuthServices
    ports:
      - "8081:8081"

  notification-service:
    build:
      context: ./NotificationsServices
    ports:
      - "8082:8082"

  task-service:
    build:
      context: ./TaskService
    ports:
      - "8083:8083"
      
-> Para iniciar os serviços com Docker Compose, execute:
docker-compose up --build

____________________________________________________________________________________________________________________________________________________________________________________________________

**-> Informações Adicionais**

Autenticação Service: Lida com autenticação de usuários e emite tokens.

Notificações Service: Envia notificações para os usuários.

Tarefas Service: Gerencia as tarefas dos usuários.


Para mais detalhes sobre o funcionamento interno de cada microsserviço, consulte a documentação e o código fonte em cada diretório de serviço.
