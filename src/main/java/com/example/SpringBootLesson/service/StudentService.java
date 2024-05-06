package com.example.SpringBootLesson.service;

import com.example.SpringBootLesson.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudents();

    Student saveStudent(Student student);

    Student findStudentByEmail(String email);

    Student updateStudent(Student student);

    void deleteStudent(String email);
}
