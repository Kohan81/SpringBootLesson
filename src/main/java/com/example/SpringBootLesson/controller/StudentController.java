package com.example.SpringBootLesson.controller;

import com.example.SpringBootLesson.model.Student;
import com.example.SpringBootLesson.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudents(){
        //todo
        return service.findAllStudents();
    }
}
