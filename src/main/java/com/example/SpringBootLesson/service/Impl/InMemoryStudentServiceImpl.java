package com.example.SpringBootLesson.service.Impl;

import com.example.SpringBootLesson.model.Student;
import com.example.SpringBootLesson.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentServiceImpl  implements StudentService {
    @Override
    public List<Student> findAllStudents() {
        return List.of(
                Student.builder().firstName("Oleg").email("oleg12@gmail.com").age(41).build(),
                Student.builder().firstName("Григорий").email("vasya12@gmail.com").age(51).build(),
                Student.builder().firstName("Anna").email("anya18@gmail.com").age(38).build(),
                Student.builder().firstName("Eugene").email("eugene4t4@yahoo.com").age(42).build()
        );
    }
}
