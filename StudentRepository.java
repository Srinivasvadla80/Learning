package com.student.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.sms.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
