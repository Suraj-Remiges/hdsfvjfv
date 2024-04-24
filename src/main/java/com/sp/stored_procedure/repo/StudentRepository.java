package com.sp.stored_procedure.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.sp.stored_procedure.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Procedure(value = "add_student")
    Student addStudent(@Param("student_name") String name, @Param("student_age") Integer age);

    @Procedure
    void add_student(@Param("student_name") String name, @Param("student_age") Integer age);

}
