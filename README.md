# GradeSphere – Student Academic Grade Calculator

<p align="center">
  <strong>A Java-Based Academic Grade Management & Performance Analysis System</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot" />
  <img src="https://img.shields.io/badge/MySQL-8.0-blue?logo=mysql" />
  <img src="https://img.shields.io/badge/Maven-Build%20Tool-red?logo=apachemaven" />
  <img src="https://img.shields.io/badge/License-MIT-yellow.svg" />
</p>

---

## Overview

**GradeSphere** is a comprehensive Java-based Student Academic Grade Calculator designed to simplify student grade management and academic performance evaluation.

The application combines core Java programming concepts with modern backend technologies to provide student record management, automated grade calculation, database operations, and CSV-based data handling.

It demonstrates practical implementation of Java fundamentals, object-oriented programming, multithreading, JDBC, Spring Boot, and web application development in a unified project.

## Key Features

- **Student Management** – Add, view, update, and delete student records.
- **Grade Calculation** – Calculate student marks, percentages, and grades.
- **Database Integration** – Store and manage student information using MySQL and JDBC/JPA.
- **CSV Import & Export** – Import student records and export academic data.
- **RESTful APIs** – Perform student and grade management operations through REST endpoints.
- **Web Interface** – Interact with the application through a Thymeleaf-based interface.
- **Exception Handling** – Handle application and data-related errors.
- **Multithreading** – Demonstrate concurrent execution using Java threads.

## Technology Stack

| Category | Technologies |
|---|---|
| Programming Language | Java 17+ |
| Backend Framework | Spring Boot 3.x |
| Database | MySQL 8.0+ |
| Database Connectivity | JDBC, Spring Data JPA |
| Frontend | Thymeleaf, HTML, CSS |
| Build Tool | Apache Maven |
| CSV Processing | OpenCSV |
| API Architecture | RESTful APIs |
| ORM | Hibernate |

## Core Java Concepts Implemented

This project demonstrates several important Java programming concepts:

- File Handling – Reading and writing CSV files.
- Multithreading – Thread creation and concurrent execution.
- JDBC – Database connectivity and SQL operations.
- Spring Boot – Application development and REST API implementation.
- Servlets – Web request and response handling.
- Packages and Interfaces – Modular application design.
- Wrapper Classes – Object representations of primitive data types.
- Generics – Type-safe and reusable programming.
- Exception Handling – Managing runtime and application errors.
- Collections – Organizing and manipulating student records.

## Project Architecture

The application follows a layered architecture to separate responsibilities and improve maintainability.

| Layer | Responsibility |
|---|---|
| Controller | Handles incoming HTTP requests |
| Service | Implements business logic and grade calculations |
| Repository | Manages database operations |
| Model | Defines student and academic data entities |
| Servlet | Handles servlet-based web operations |
| Utility | Provides reusable helper functions |
| Thread | Contains multithreading implementations |
| Exception | Handles application-specific exceptions |

## REST API Endpoints

### Student Management

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/students` | Add a new student |
| GET | `/api/students` | Retrieve all students |
| GET | `/api/students/{id}` | Retrieve a student by ID |
| PUT | `/api/students/{id}` | Update student details |
| DELETE | `/api/students/{id}` | Delete a student |

### Grade Management

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/grades/calculate` | Calculate student grades |

### CSV Operations

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/export/csv` | Export student records to CSV |
| POST | `/api/import/csv` | Import student records from CSV |

### Servlet Endpoints

| Endpoint | Description |
|---|---|
| `/student-form` | Student registration form |
| `/calculate-grade` | Grade calculation servlet |

## Project Structure

```text
GradeSphere/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── studentgrade/
│   │   │           ├── model/
│   │   │           ├── repository/
│   │   │           ├── service/
│   │   │           ├── controller/
│   │   │           ├── servlet/
│   │   │           ├── util/
│   │   │           ├── thread/
│   │   │           ├── exception/
│   │   │           └── StudentGradeApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   │
│   └── test/
│
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Prerequisites

Ensure the following tools are installed:

- JDK 17 or higher
- Apache Maven 3.6+
- MySQL 8.0+
- IntelliJ IDEA, Eclipse, or Visual Studio Code
- Git

```

## Future Enhancements

- Advanced academic performance analytics.
- Student performance visualization and reporting.
- Role-based access control.
- Enhanced dashboard and user experience.
- Additional academic reporting capabilities.

## Learning Objectives

GradeSphere was developed to gain practical experience in:

- Java programming and object-oriented principles.
- Backend application development using Spring Boot.
- Relational database management and integration.
- REST API design and implementation.
- File handling and CSV processing.
- Multithreading and exception management.
- Layered architecture and modular software development.

## Author

**Nikhil Murugan D P**

---

<p align="center">
  <strong>GradeSphere</strong><br/>
  Simplifying Academic Performance, One Grade at a Time.
</p>