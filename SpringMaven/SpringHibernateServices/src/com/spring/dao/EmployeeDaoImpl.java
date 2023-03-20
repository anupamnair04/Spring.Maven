package com.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	private SessionFactory factory;
	
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	private Session getSession(){
		return factory.getCurrentSession();
	}

	public void saveEmployee(Employee employee) {
		getSession().save(employee);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmployees() {
		Criteria criteria = getSession().createCriteria(Employee.class);
		return (List<Employee>) criteria.list();
	}
	
	public void updateEmployee(Employee employee){
		getSession().update(employee);
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("delete from Employee e where e.id=?");
		query.setParameter(0, id);
		int i=query.executeUpdate();
		System.out.println("record deleted "+i);
		
		/*Employee e1 = (Employee) getSession().get(Employee.class,124);
		    
		    getSession().delete(e1); */
	}

	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("id",id));
		return (Employee) criteria.uniqueResult();
	}

}