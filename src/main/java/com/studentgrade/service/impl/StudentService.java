package com.studentgrade.service.impl;

import com.studentgrade.exception.StudentNotFoundException;
import com.studentgrade.model.GradeResult;
import com.studentgrade.model.Student;
import com.studentgrade.repository.StudentRepository;
import com.studentgrade.service.IGradeCalculator;
import com.studentgrade.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Student Service Implementation
 * Demonstrates: Service layer, JDBC operations, Transaction management
 */
@Service
@Transactional
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private IGradeCalculator<Integer> gradeCalculator;

    @Override
    public Student saveStudent(Student student) {
        // Calculate grades before saving
        GradeResult<Integer> result = gradeCalculator.calculateGradeResult(student);
        student.setTotalMarks(result.getTotalMarks());
        student.setPercentage(result.getPercentage());
        student.setGrade(result.getGrade());
        student.setStatus(result.getStatus());

        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student existingStudent = getStudentById(id);

        existingStudent.setName(student.getName());
        existingStudent.setRollNumber(student.getRollNumber());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setMathsMarks(student.getMathsMarks());
        existingStudent.setPhysicsMarks(student.getPhysicsMarks());
        existingStudent.setChemistryMarks(student.getChemistryMarks());
        existingStudent.setEnglishMarks(student.getEnglishMarks());
        existingStudent.setComputerMarks(student.getComputerMarks());

        // Recalculate grades
        GradeResult<Integer> result = gradeCalculator.calculateGradeResult(existingStudent);
        existingStudent.setTotalMarks(result.getTotalMarks());
        existingStudent.setPercentage(result.getPercentage());
        existingStudent.setGrade(result.getGrade());
        existingStudent.setStatus(result.getStatus());

        return studentRepository.save(existingStudent);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException(id);
        }
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> searchStudentsByName(String name) {
        return studentRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public Student getStudentByRollNumber(String rollNumber) {
        return studentRepository.findByRollNumber(rollNumber)
                .orElseThrow(() -> new StudentNotFoundException("Student not found with roll number: " + rollNumber));
    }
}
