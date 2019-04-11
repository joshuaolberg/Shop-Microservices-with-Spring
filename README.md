# Shop-Microservices-with-Spring

This Project splits the monolith "Shop" into different Microservices which can be connected with an Discovery Service (Eureka).

## How can I test the services?

- Clone the project into your IDE
- Run every microservice via "XXXApplication.java"
- The microservices will automatically connect to the eurekaserver, if it's running

## Used Technologies

- Spring Boot
- Spring Data JPA
- Spring Cloud: REST Client (Feign), Discovery Service (Eureka), API Gateway Service (Zuul).
- Docker Container
- Maven
- JUnit
