# iCET - Demo Spring Boot Application - (01)

This is a demo Spring Boot application created for academic purposes. It provides RESTful APIs to handle city and student data.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Setup](#setup)
- [API Endpoints](#api-endpoints)

## Features

- Retrieve city information based on postal codes.
- Perform CRUD operations on student records.

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- Lombok
- Jackson
- MySQL

## Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/demo-spring-boot.git
    cd demo-spring-boot
    ```

2. Configure the database connection in `src/main/resources/application.yml`:
    ```yaml
    spring:
      datasource:
        url: jdbc:mysql://localhost:3306/student_crm
        username: root
        password: your_password
      jpa:
        hibernate:
          ddl-auto: update
    ```

3. Run the application:
    ```bash
    ./mvnw spring-boot:run
    ```

## API Endpoints

- **City Controller**
    - `GET /city/{postalCode}`: Get city information by postal code.

- **Student Controller**
    - `POST /student`: Save a new student record.
    - `GET /student`: Retrieve all student records.
