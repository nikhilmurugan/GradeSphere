package com.studentgrade.service;

import com.studentgrade.model.Student;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * File Service Interface for CSV operations
 * Demonstrates: Interface for File Handling
 */
public interface IFileService {

    /**
     * Import students from CSV file
     */
    List<Student> importStudentsFromCSV(MultipartFile file) throws IOException;

    /**
     * Export students to CSV file
     */
    String exportStudentsToCSV(List<Student> students) throws IOException;

    /**
     * Read students from CSV file path
     */
    List<Student> readStudentsFromCSV(String filePath) throws IOException;

    /**
     * Write students to CSV file path
     */
    void writeStudentsToCSV(List<Student> students, String filePath) throws IOException;
}
