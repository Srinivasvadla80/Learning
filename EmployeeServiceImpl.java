package com.curd.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.curd.springboot.exception.ResourceNotFoundException;
import com.curd.springboot.model.Employee;
import com.curd.springboot.repository.EmployeeRespository;
import com.curd.springboot.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	private EmployeeRespository employeeRespository;
	
	
	
	public EmployeeServiceImpl(EmployeeRespository employeeRespository) {
		super();
		this.employeeRespository = employeeRespository;
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRespository.save(employee);
	}



	@Override
	public List<Employee> getAllEmployees() {
return employeeRespository.findAll();
	
	}



	@Override
	public Employee getEmployeeById(Long id) {
		/*Optional<Employee> emp=employeeRespository.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			throw new ResourceNotFoundException("Employee", "id", id);
		}
			}*/
		
		return employeeRespository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "id", id));
		

}



	@Override
	public Employee updateEmployee(Employee employee, long id) {
		
		//we need to check weather the employee given existed or not
		Employee existedEmployee=employeeRespository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee",
				"id", id));
		existedEmployee.setFirstName(employee.getFirstName());
		existedEmployee.setLastName(employee.getLastName());
		existedEmployee.setEmail(employee.getEmail());
		//save existed employee details
		employeeRespository.save(existedEmployee);
		return existedEmployee;
	}



	@Override
	public void deleteEmployee(long id) {
		/*
		 * Employee e=new Employee(); e.setId(id);
		 */
		
		
		
		employeeRespository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "id", id));
		employeeRespository.deleteById(id);;
	}
}