package com.spring.service;

import java.util.List;
import com.spring.model.Employee;

public interface EmployeeService {

	void saveEmployee(Employee employee);

	List<Employee> findAllEmployees();

	void deleteEmployeeById(int id);

	Employee findById(int id);

	void updateEmployee(Employee employee);
}