package com.curd.springboot.service;

import java.util.List;

import com.curd.springboot.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(Long id);
	
	public Employee updateEmployee(Employee employee,long id);
	
	public void deleteEmployee(long id);

}
