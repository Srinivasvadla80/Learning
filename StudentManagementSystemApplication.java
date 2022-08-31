package com.student.sms;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.sms.model.Student;
import com.student.sms.repository.StudentRepository;


@SpringBootApplication
public class StudentManagementSystemApplication  {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	
	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * Student s1=new Student("vadla", "srinivas", "srinivas@gmail.com");
	 * studentRepository.save(s1); Student s2=new Student("vadla", "sneha",
	 * "sneha@gmail.com"); studentRepository.save(s2); Student s3=new
	 * Student("vadla", "nihas", "nihas@gmail.com"); studentRepository.save(s3);
	 * 
	 * }
	 */
}
