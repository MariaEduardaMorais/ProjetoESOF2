FROM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/DiscoveryServer-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "app.jar"]
