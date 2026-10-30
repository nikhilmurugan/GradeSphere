package com.studentgrade.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Grade Result DTO (Data Transfer Object)
 * Demonstrates: Generics usage, Wrapper Classes, Packages
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeResult<T extends Number> {

    private Long studentId;
    private String studentName;
    private String rollNumber;

    // Using Generic Type T for marks
    private T mathsMarks;
    private T physicsMarks;
    private T chemistryMarks;
    private T englishMarks;
    private T computerMarks;

    // Using Wrapper classes
    private Integer totalMarks;
    private Double percentage;
    private String grade;
    private String status;

    /**
     * Calculate grade based on percentage
     * Demonstrates: Method with business logic
     */
    public void calculateGrade() {
        if (percentage >= 90) {
            this.grade = "A+";
        } else if (percentage >= 80) {
            this.grade = "A";
        } else if (percentage >= 70) {
            this.grade = "B+";
        } else if (percentage >= 60) {
            this.grade = "B";
        } else if (percentage >= 50) {
            this.grade = "C";
        } else if (percentage >= 40) {
            this.grade = "D";
        } else {
            this.grade = "F";
        }

        this.status = percentage >= 40 ? "PASS" : "FAIL";
    }
}
