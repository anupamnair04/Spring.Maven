package com.spring.client;

import java.util.Date;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.config.HibernateConfiguration;
import com.spring.model.Employee;
import com.spring.service.EmployeeService;

public class AppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);

		EmployeeService service = (EmployeeService) context.getBean("employeeService");

		/*
		 * Create Employee1
		 */
		Employee e2 = new Employee();
		e2.setId(124);
		e2.setName("aaa");
		e2.setRole("Clerk");
		
		Employee e1 = new Employee();
		e1.setId(121);
		e1.setName("bbb");
		e1.setRole("MD");
		
	    Employee e = new Employee();
	    e.setId(100);
	    e.setName("ccc");
		e.setRole("Manager");
		e.setInsertTime(new Date());
		/*
		 * Persist both Employees
		 */
		service.saveEmployee(e1);
		service.saveEmployee(e2);
		service.saveEmployee(e);

		/*
		 * Get all employees list from database
		 */
		List<Employee> employees = service.findAllEmployees();
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		/*
		 * delete an employee
		 */
		service.deleteEmployeeById(124);

		/*
		 * update an employee
		 */

		Employee employee = service.findById(100);
		employee.setName("jayshree");
		service.updateEmployee(employee);

		/*
		 * Get all employees list from database
		 */
		List<Employee> employeeList = service.findAllEmployees();
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}

		context.close();
	}
}