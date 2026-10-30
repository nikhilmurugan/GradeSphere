package com.studentgrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Main Application Class for Student Grade Calculator
 * Demonstrates: Spring Boot application setup
 */
@SpringBootApplication
@ServletComponentScan // Enable servlet component scanning
public class StudentGradeApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentGradeApplication.class, args);
        System.out.println("\n=================================================");
        System.out.println("Student Grade Calculator Application Started!");
        System.out.println("Access the application at: http://localhost:8080");
        System.out.println("=================================================\n");
    }
}
