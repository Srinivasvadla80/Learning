package com.curd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curd.springboot.model.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Long> {

}
