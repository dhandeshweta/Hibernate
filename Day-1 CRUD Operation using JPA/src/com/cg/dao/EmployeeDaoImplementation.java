package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Employee;

public class EmployeeDaoImplementation implements EmployeeDao
{
	//we are going to use EntityManager method-CRUD
	private EntityManager em;
	
	//default constructor
	public EmployeeDaoImplementation() {
		super();
		em = JPAUtil.getEntityManager();
	}

	@Override
	public void addEmployee(Employee emp) {
		//to add => persist(objname)
		em.persist(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		//to update => merge(objname)
		em.merge(emp);
	}

	@Override
	public Employee getEmployeeById(int ID) {
		//to retrieve data => find(classname, pk)
		Employee emp = em.find(Employee.class, ID);
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) {
		//to remove => remove(objname)
		em.remove(emp);
	}

	//transaction methods to start and close the Entity Manager
	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
	}

}
