package com.example.SpringBootLesson.repository;

import com.example.SpringBootLesson.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {

    private final List<Student> STUDENTS = new ArrayList<Student>();

    List<Student> findAllStudents() {
        return STUDENTS;
    }

    public Student saveStudent(Student student) {
        STUDENTS.add(student);
        return student;
    }


    public Student findStudentByEmail(String email) {
        return STUDENTS.stream().
                filter(student -> student.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }


    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0, STUDENTS.size())
                .filter(i -> STUDENTS.get(i).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex != -1) {
            STUDENTS.set(studentIndex, student);
        }
        return null;
    }


    public void deleteStudent(String email) {

        var student = findStudentByEmail(email);
        if (student != null) {
            STUDENTS.remove(student);
        }
    }
}
