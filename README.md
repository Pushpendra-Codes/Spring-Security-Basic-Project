# Spring Boot Authentication Project

This is a **Spring Boot backend project** demonstrating **user authentication** using **Spring Security**, with users stored in a **database (JPA/Hibernate)**.  

The project is ideal for learning how spring security config and filterchain works internally.



## Features

- Database-backed user authentication
- Custom `UserDetailsService`
- Password validation
- Uses Spring Data JPA and Hibernate
- Register new User
- Passwords are securely hashed using BCrypt before storing in the database
- Plain-text passwords are never stored
- Login Verification with Username and Password
- JWT Token Generated when user Login
- JWT Token verification
- Login with JWT Token feature


## Tech Stack

- Java 
- Spring Boot 
- Spring Security 6
- Spring Data JPA (Hibernate)
- PostgreSQL 
- Maven
- Spring A
- JWT (JSON Web Token)


## Project Structure


Spring-Security-Basics/
├── .idea/
├── demo/
│   ├── .mvn/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/patidar/demo/
│   │       │       ├── config/
│   │       │       │   ├── JwtFilter.java
│   │       │       │   └── SecurityConfig.java
│   │       │       ├── controller/
│   │       │       │   ├── Controller.java
│   │       │       │   └── UserController.java
│   │       │       ├── model/
│   │       │       │   ├── UserPrincipal.java
│   │       │       │   └── Users.java
│   │       │       ├── repository/
│   │       │       │   └── UserRepo.java
│   │       │       ├── service/
│   │       │       │   ├── JWTService.java
│   │       │       │   ├── MyUserDetailsService.java
│   │       │       │   └── UserService.java
│   │       │       └── DemoApplication.java
│   │       └── resources/
│   │           ├── static/
│   │           ├── templates/
│   │           └── application.properties
│   └── pom.xml
└── README.md




