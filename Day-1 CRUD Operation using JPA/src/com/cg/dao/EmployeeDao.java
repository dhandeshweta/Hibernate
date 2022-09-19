package com.cg.dao;

import com.cg.entities.Employee;

public interface EmployeeDao
{
	//by default, all the methods are abstract in the interface
	void addEmployee(Employee emp);		//create
	void updateEmployee(Employee emp);	//update
	Employee getEmployeeById(int ID);		//retrieve
	void removeEmployee(Employee emp);	//delete
	
	void commitTransaction();	//close an entity manager
	void beginTransaction();	//begin the operation of entity manager
}