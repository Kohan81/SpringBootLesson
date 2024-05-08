package com.example.SpringBootLesson.controller;

import com.example.SpringBootLesson.model.Student;
import com.example.SpringBootLesson.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student){
        service.saveStudent(student);
        return "new student was saved";
    }

    @GetMapping("/{email}")
    public Student findStudentByEmail(@PathVariable String email){ //после @PathVariable в скобках тоже нужно указать имя переменной,
                                                                    //  которую получаем, но т.к. они совпадают "/{email}" и "email"
        return service.findStudentByEmail(email);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
        service.deleteStudent(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }
}
