package com.studentgrade.exception;

/**
 * Custom Exception for File Processing errors
 * Demonstrates: Exception Handling in File Operations
 */
public class FileProcessingException extends RuntimeException {

    public FileProcessingException(String message) {
        super(message);
    }

    public FileProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
