package com.studentgrade.service;

import com.studentgrade.model.GradeResult;
import com.studentgrade.model.Student;

import java.util.List;

/**
 * Grade Calculator Interface
 * Demonstrates: Interface definition, Generics
 */
public interface IGradeCalculator<T extends Number> {

    /**
     * Calculate total marks for a student
     */
    Integer calculateTotalMarks(T maths, T physics, T chemistry, T english, T computer);

    /**
     * Calculate percentage from total marks
     */
    Double calculatePercentage(Integer totalMarks, Integer maxMarks);

    /**
     * Determine grade based on percentage
     */
    String determineGrade(Double percentage);

    /**
     * Calculate complete grade result
     */
    GradeResult<T> calculateGradeResult(Student student);

    /**
     * Validate marks (should be between 0 and 100)
     */
    boolean validateMarks(T marks);
}
