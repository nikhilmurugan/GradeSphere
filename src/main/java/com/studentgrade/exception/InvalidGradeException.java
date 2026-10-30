package com.studentgrade.exception;

/**
 * Custom Exception for Invalid Grade scenarios
 * Demonstrates: Exception Handling with Wrapper Classes
 */
public class InvalidGradeException extends RuntimeException {

    private Integer marks;

    public InvalidGradeException(String message) {
        super(message);
    }

    public InvalidGradeException(String message, Integer marks) {
        super(message);
        this.marks = marks;
    }

    public Integer getMarks() {
        return marks;
    }
}
