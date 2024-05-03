package com.example.SpringBootLesson.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@Builder
public class Student {

    private String firstName;
    private String lastName;
    private int age;
    @NonNull
    private String email;
    private LocalDate dob;
}
