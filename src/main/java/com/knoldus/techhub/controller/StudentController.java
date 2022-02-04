package com.knoldus.techhub.controller;

import com.knoldus.techhub.jooqgenerated.tables.pojos.Student;
import com.knoldus.techhub.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
