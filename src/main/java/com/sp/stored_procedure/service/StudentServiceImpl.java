package com.sp.stored_procedure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.stored_procedure.entity.Student;
import com.sp.stored_procedure.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        System.out.println("1st method");
        return studentRepository.addStudent(student.getName(), student.getAge());
    }

    @Override
    public void addStudent1(String studentName, int studentAge) {
        // studentRepository.add_student(studentName, studentAge);
    }

}
