package com.studentgrade.service;

import com.studentgrade.model.Student;

import java.util.List;

/**
 * Student Service Interface
 * Demonstrates: Interface with CRUD operations
 */
public interface IStudentService {

    Student saveStudent(Student student);

    Student updateStudent(Long id, Student student);

    Student getStudentById(Long id);

    List<Student> getAllStudents();

    void deleteStudent(Long id);

    List<Student> searchStudentsByName(String name);

    Student getStudentByRollNumber(String rollNumber);
}
