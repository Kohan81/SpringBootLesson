package com.example.SpringBootLesson.service.Impl;

import com.example.SpringBootLesson.model.Student;
import com.example.SpringBootLesson.repository.InMemoryStudentDAO;
import com.example.SpringBootLesson.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl  implements StudentService {

    private final InMemoryStudentDAO repository;
    @Override
    public List<Student> findAllStudents() {
        return List.of(
                Student.builder().firstName("Oleg").email("oleg12@gmail.com").age(41).build(),
                Student.builder().firstName("Григорий").email("vasya12@gmail.com").age(51).build(),
                Student.builder().firstName("Anna").email("anya18@gmail.com").age(38).build(),
                Student.builder().firstName("Eugene").email("eugene4t4@yahoo.com").age(42).build()
        );
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findStudentByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
