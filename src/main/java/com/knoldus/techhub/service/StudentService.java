package com.knoldus.techhub.service;

import com.knoldus.techhub.jooqgenerated.tables.pojos.Student;
import com.knoldus.techhub.repos.StudentRepo;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getStudents() {
        return studentRepo.getStudents();
    }
}
