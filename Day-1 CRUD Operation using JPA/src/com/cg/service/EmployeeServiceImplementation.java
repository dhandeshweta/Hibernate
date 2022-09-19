package com.cg.service;

import com.cg.dao.EmployeeDao;
import com.cg.dao.EmployeeDaoImplementation;
import com.cg.entities.Employee;

public class EmployeeServiceImplementation implements EmployeeService
{
	private EmployeeDao dao;
	
	public EmployeeServiceImplementation() {
		super();
		dao = new EmployeeDaoImplementation();
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public Employee getEmployeeById(int ID) {
		Employee emp = dao.getEmployeeById(ID);
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeEmployee(emp);
		dao.commitTransaction();
	}

}
