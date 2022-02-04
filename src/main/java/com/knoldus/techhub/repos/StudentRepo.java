package com.knoldus.techhub.repos;

import com.knoldus.techhub.jooqgenerated.Tables;
import com.knoldus.techhub.jooqgenerated.tables.pojos.Student;
import java.util.List;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {

    @Autowired
    private DSLContext dslContext;

    public List<Student> getStudents() {
        return dslContext.selectFrom(Tables.STUDENT)
                .fetchInto(Student.class);
    }
}
