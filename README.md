# HelloRest – Spring Boot REST Application

## Overview

This project is a simple **Spring Boot REST API application** that demonstrates how to create and run a basic REST endpoint. The application returns a greeting message when a request is sent to the server.

This project is created using **Spring Boot**, **Maven**, and **Java 17**.

---

## Technologies Used

* Java 17
* Spring Boot
* Maven
* Spring Web
* IntelliJ IDEA

## Main Application Class

`HellorestApplication.java`

This is the **entry point** of the Spring Boot application.

```java
@SpringBootApplication
public class HellorestApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellorestApplication.class, args);
    }

}
```

## REST Controller

`HelloController.java`

This controller handles HTTP requests and returns a greeting message.

```java
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }

}
```

---

## Running the Application

1. Open the project in **IntelliJ IDEA**.
2. Run the main class:

```
HellorestApplication.java
```

3. The application will start on port **8080**.

---

## Testing the API

Open your browser and enter:

```
http://localhost:8080/hello
```

Output:

```
Hello from BridgeLabz
```

---

## Learning Objectives

This project demonstrates:

* Creating a Spring Boot project
* Understanding project structure
* Creating a REST Controller
* Handling HTTP GET requests
* Running a Spring Boot application