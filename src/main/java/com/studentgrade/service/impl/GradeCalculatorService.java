package com.studentgrade.service.impl;

import com.studentgrade.exception.InvalidGradeException;
import com.studentgrade.model.GradeResult;
import com.studentgrade.model.Student;
import com.studentgrade.service.IGradeCalculator;
import org.springframework.stereotype.Service;

/**
 * Grade Calculator Service Implementation
 * Demonstrates: Interface Implementation, Generics, Wrapper Classes, Exception Handling
 */
@Service
public class GradeCalculatorService implements IGradeCalculator<Integer> {

    private static final Integer MAX_MARKS_PER_SUBJECT = 100;
    private static final Integer TOTAL_SUBJECTS = 5;
    private static final Integer TOTAL_MAX_MARKS = MAX_MARKS_PER_SUBJECT * TOTAL_SUBJECTS;

    @Override
    public Integer calculateTotalMarks(Integer maths, Integer physics, Integer chemistry, 
                                       Integer english, Integer computer) {
        // Validate all marks
        validateMarks(maths);
        validateMarks(physics);
        validateMarks(chemistry);
        validateMarks(english);
        validateMarks(computer);

        // Calculate total using wrapper class methods
        return maths + physics + chemistry + english + computer;
    }

    @Override
    public Double calculatePercentage(Integer totalMarks, Integer maxMarks) {
        if (maxMarks == null || maxMarks == 0) {
            throw new InvalidGradeException("Max marks cannot be zero or null");
        }
        return (totalMarks.doubleValue() / maxMarks.doubleValue()) * 100.0;
    }

    @Override
    public String determineGrade(Double percentage) {
        if (percentage >= 90.0) {
            return "A+";
        } else if (percentage >= 80.0) {
            return "A";
        } else if (percentage >= 70.0) {
            return "B+";
        } else if (percentage >= 60.0) {
            return "B";
        } else if (percentage >= 50.0) {
            return "C";
        } else if (percentage >= 40.0) {
            return "D";
        } else {
            return "F";
        }
    }

    @Override
    public GradeResult<Integer> calculateGradeResult(Student student) {
        try {
            GradeResult<Integer> result = new GradeResult<>();
            result.setStudentId(student.getId());
            result.setStudentName(student.getName());
            result.setRollNumber(student.getRollNumber());

            // Set individual marks
            result.setMathsMarks(student.getMathsMarks());
            result.setPhysicsMarks(student.getPhysicsMarks());
            result.setChemistryMarks(student.getChemistryMarks());
            result.setEnglishMarks(student.getEnglishMarks());
            result.setComputerMarks(student.getComputerMarks());

            // Calculate total marks
            Integer totalMarks = calculateTotalMarks(
                student.getMathsMarks(),
                student.getPhysicsMarks(),
                student.getChemistryMarks(),
                student.getEnglishMarks(),
                student.getComputerMarks()
            );
            result.setTotalMarks(totalMarks);

            // Calculate percentage
            Double percentage = calculatePercentage(totalMarks, TOTAL_MAX_MARKS);
            result.setPercentage(Math.round(percentage * 100.0) / 100.0); // Round to 2 decimals

            // Calculate grade and status
            result.calculateGrade();

            return result;
        } catch (Exception e) {
            throw new InvalidGradeException("Error calculating grade for student: " + student.getName(), e);
        }
    }

    @Override
    public boolean validateMarks(Integer marks) {
        if (marks == null) {
            throw new InvalidGradeException("Marks cannot be null");
        }
        if (marks < 0 || marks > MAX_MARKS_PER_SUBJECT) {
            throw new InvalidGradeException(
                "Marks must be between 0 and " + MAX_MARKS_PER_SUBJECT, marks
            );
        }
        return true;
    }
}
