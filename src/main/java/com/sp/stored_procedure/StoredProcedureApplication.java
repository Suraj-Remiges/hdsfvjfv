package com.sp.stored_procedure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@SpringBootApplication
public class StoredProcedureApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoredProcedureApplication.class, args);
	}

	// @Query(value = "SELECT assignment6.save_student(:student_name, :student_age)", nativeQuery = true)
    // void addStd(@Param("student_name") String name, @Param("student_age") Integer age);

	// @Override
    // public void addStudent1(String studentName, int studentAge) {
    //     studentRepository.addStd(studentName, studentAge);
    // }

}
