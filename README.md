# Demo App

A simple demo application built with Java, Spring Boot, and Maven.

## Features

- RESTful API endpoints
- Spring Boot auto-configuration
- Maven-based build and dependency management

## Prerequisites

- Java 21
- Maven 3.8+
- Git

## Setup

1. Clone the repository:
```shell
git clone https://github.com/karthikeyan-c-tw/GC-Performance-Demo.git
cd GC-Performance-Demo
```
2. Build the project:
```shell
mvn clean install
```
3. Run the application:
```shell
mvn spring-boot:run
```
4. Running the application kubernetes
```shell
mvn clean package
docker build -t load-app:latest .
kubectl apply -f app.yaml
```
5. Generating a load (job runs every 5 minutes)
```shell
kubectl apply -f job.yaml
```

## Usage

- The application will start on `http://localhost:8080`.

## Project Structure

- `src/main/java` - Application source code
- `src/main/resources` - Configuration files
- `pom.xml` - Maven build configuration

## License

This project is licensed under the MIT License.
