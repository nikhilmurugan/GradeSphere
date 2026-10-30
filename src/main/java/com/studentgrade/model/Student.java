package com.studentgrade.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Student Entity Class
 * Demonstrates: JPA Entity, Wrapper Classes (Integer, Double), Packages
 */
@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String rollNumber;

    @Column(nullable = false)
    private String email;

    // Wrapper classes for marks (demonstrating Wrapper Classes concept)
    private Integer mathsMarks;
    private Integer physicsMarks;
    private Integer chemistryMarks;
    private Integer englishMarks;
    private Integer computerMarks;

    // Calculated fields (using Wrapper classes)
    private Integer totalMarks;
    private Double percentage;
    private String grade;
    private String status; // PASS or FAIL

    @Column(updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    // Custom constructor for CSV import
    public Student(String name, String rollNumber, String email, 
                   Integer mathsMarks, Integer physicsMarks, Integer chemistryMarks,
                   Integer englishMarks, Integer computerMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.email = email;
        this.mathsMarks = mathsMarks;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.englishMarks = englishMarks;
        this.computerMarks = computerMarks;
    }
}
