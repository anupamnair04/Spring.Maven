package com.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.spring.dao.EmployeeDao;
import com.spring.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}

	public List<Employee> findAllEmployees() {
		return dao.findAllEmployees();
	}

	public void updateEmployee(Employee employee){
		dao.updateEmployee(employee);
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		dao.deleteEmployeeById(id);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}
}