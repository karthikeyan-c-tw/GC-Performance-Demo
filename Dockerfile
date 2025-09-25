FROM registry.access.redhat.com/ubi9/openjdk-21-runtime
COPY ./target/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]