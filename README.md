# iCET - Demo Spring Boot Application - (01)

This is a demo Spring Boot application created for academic purposes. It provides RESTful APIs to handle city and student data.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Setup](#setup)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Features

- Retrieve city information based on postal codes.
- Perform CRUD operations on student records.

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- Lombok
- Jackson

## Setup

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/demo-spring-boot.git
    cd demo-spring-boot
    ```

2. Build the project:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

4. The application will be available at `http://localhost:8080`.

## API Endpoints

### City API

- **Get City by Postal Code**
    - **URL:** `/city/{postalCode}`
    - **Method:** `GET`
    - **Response:** JSON object with city information

### Student API

- **Save Student**
    - **URL:** `/student`
    - **Method:** `POST`
    - **Request Body:** JSON object with student details
    - **Response:** `200 OK` on success

- **Get All Students**
    - **URL:** `/student`
    - **Method:** `GET`
    - **Response:** JSON array of student records
