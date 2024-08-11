FROM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/AuthServices-0.0.1-SNAPSHOT.jar /app/auth-service.jar
ENTRYPOINT ["java", "-jar", "/app/auth-service.jar"]
