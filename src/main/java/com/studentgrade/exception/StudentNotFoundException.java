package com.studentgrade.exception;

/**
 * Custom Exception for Student Not Found scenarios
 * Demonstrates: Custom Exception Handling
 */
public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundException(Long studentId) {
        super("Student not found with ID: " + studentId);
    }
}
