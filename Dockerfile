FROM openjdk:19-jdk-alpine
WORKDIR /app
COPY target/Restaurant-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "app.jar"]
