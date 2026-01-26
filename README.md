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

---

## Tech Stack

- Java 
- Spring Boot 
- Spring Security 6
- Spring Data JPA (Hibernate)
- PostgreSQL 
- Maven

---

## Project Structure

demo
 ├── src
 │    ├── main
 │    │    ├── java
 │    │    │    └── com/patidar/demo
 │    │    │         ├── DemoApplication.java
 │    │    │         ├── config/SecurityConfig.java 
 │    │    │         ├── model
 │    │    │         │    ├── Users.java 
 │    │    │         │    ├── Users.java 
 │    │    │         │    └── UserPrincipal 
 │    │    │         ├── repository/UserRepo.java
 │    │    │         └── service/MyUserDetailsService.java
 │    │    └── resources
 │    │         └── application.properties
 └── pom.xml



