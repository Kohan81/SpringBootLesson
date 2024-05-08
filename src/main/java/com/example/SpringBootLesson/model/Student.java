package com.example.SpringBootLesson.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    @Transient
    private int age;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
}
