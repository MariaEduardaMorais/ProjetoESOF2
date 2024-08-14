FROM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/NotificationsServices-0.0.1-SNAPSHOT.jar /app/notifications-service.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "notifications-service.jar"]
