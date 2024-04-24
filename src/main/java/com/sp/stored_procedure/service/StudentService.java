package com.sp.stored_procedure.service;

import org.springframework.stereotype.Service;

import com.sp.stored_procedure.entity.Student;

@Service
public interface StudentService {

    Student addStudent(Student student);

    public void addStudent1(String studentName, int studentAge);

}
