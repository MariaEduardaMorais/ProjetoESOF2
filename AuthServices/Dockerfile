FROM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/AuthServices-0.0.1-SNAPSHOT.jar /app/auth-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "auth-service.jar"]
