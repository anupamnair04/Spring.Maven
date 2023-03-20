package com.spring.dao;

import java.util.List;
import com.spring.model.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	void deleteEmployeeById(int id);
	
	Employee findById(int id);
	
	void updateEmployee(Employee employee);
}