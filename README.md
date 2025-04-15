# Spring Boot Microservices - Quiz Application

This is a microservices-based application built using Spring Boot 3.4.4, Spring Cloud Gateway, Eureka Server, and OpenFeign. The project demonstrates how to design, build, and communicate between microservices using service discovery and routing.

## 🔧 Tech Stack

- Java 17+
- Spring Boot 3.4.4
- Spring Cloud 2024.0.1
- Spring Cloud Eureka (Service Registry)
- Spring Cloud Gateway (API Gateway)
- OpenFeign (Inter-service communication)
- MySQL (Database)
- Maven

## 📦 Microservices Overview

### 1. Service Registry (`service-registry`)
- Eureka Server running on port `8761`
- Registers all microservices
- Central registry for service discovery

### 2. API Gateway (`api-gateway`)
- Spring Cloud Gateway on port `7070`
- Forwards incoming API requests to appropriate services
- Load-balanced routing via Eureka
- Sample Routes:
  - `/question/**` → question-service
  - `/quiz/**` → quiz-service

### 3. Question Service (`question-service`)
- Manages questions and quizzes
- Exposes REST endpoints
- Runs on port `9090`

### 4. Quiz Service (`quiz-service`)
- Fetches and aggregates quizzes
- Communicates with Question service using Feign Client
- Runs on port `8081`

## 🛠️ Running the Project

Start the services in the following order:
1. `service-registry`
2. `question-service`
3. `quiz-service`
4. `api-gateway`

Use `Postman` or `curl` to access APIs via Gateway:
- `http://localhost:7070/question/getAll`
- `http://localhost:7070/quiz/getAll`

## 📦 Future Enhancements
- JWT Authentication
- Centralized Logging (ELK Stack)
- Resilience4j Circuit Breaker
- Dockerize all services

---

## 🔗 Author

Made with 💙 by [Ramesh Paswan](https://github.com/Vivek-JFS-devloper)
