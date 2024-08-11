FROM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/NotificationsServices-0.0.1-SNAPSHOT.jar /app/notifications-service.jar
ENTRYPOINT ["java", "-jar", "/app/notifications-service.jar"]
