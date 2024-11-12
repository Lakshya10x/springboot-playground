# Exploring JPA & Hibernate with Spring Boot

This project explores the journey from JDBC to JPA, diving into why JPA and Hibernate are popular choices for data persistence in Java applications, and demonstrating how Spring Boot’s Spring Data JPA makes it easy to interact with databases.

## Background

Before JPA, Java applications used plain JDBC or Spring JDBC for database interaction. While effective, these approaches required a lot of boilerplate code and offered limited abstraction. JPA, with implementations like Hibernate, simplified database interaction with object-relational mapping (ORM) and reduced the amount of manual SQL and boilerplate code. Spring Boot enhances this even further with Spring Data JPA, providing powerful abstractions and making data handling even easier.

## Why JPA and Why Hibernate?

- **JPA (Java Persistence API)** is a specification that defines a standard for ORM in Java. It allows developers to interact with relational databases using Java objects, making code more modular and easier to maintain.
- **Hibernate** is a popular JPA implementation that provides additional features and optimizations beyond the JPA specification.
- **Difference**: JPA is a specification, whereas Hibernate is an implementation. While JPA defines the standard, Hibernate provides specific implementations and optimizations that allow developers to use JPA in their applications with ease.

## How Spring Boot Simplifies JPA

Spring Boot’s **Spring Data JPA** module brings convenience to JPA by reducing the need for boilerplate code, providing a repository abstraction, and enabling quick and efficient database interaction with minimal configuration. It also makes it easy to use an in-memory database like H2 for testing and rapid development.

## Project Overview

This project involves:
1. Creating a Spring Boot project with **H2** as an in-memory database.
2. Creating a `Course` table and performing data manipulation using:
  - **Spring JDBC**
  - **JPA with Hibernate**
3. Understanding how **Spring Data JPA** makes data manipulation more efficient and concise.

# Project Structure

The project is structured into several stages, demonstrating different approaches to interacting with the Course table:

1. Spring JDBC: Using Spring's JdbcTemplate to interact with the Course table, demonstrating a JDBC-based approach.
2. JPA with Hibernate: Using the JPA standard with Hibernate as the implementation to simplify data interaction with Course entities.
3. Spring Data JPA: Utilizing Spring Data JPA's repository abstractions to handle data persistence with minimal code.

