FROM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/TaskService-0.0.1-SNAPSHOT.jar /app/task-service.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "task-service.jar"]
