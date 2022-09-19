package com.cg.service;

import com.cg.entities.Employee;

public interface EmployeeService 
{
	void addEmployee(Employee emp);		//create
	void updateEmployee(Employee emp);	//update
	Employee getEmployeeById(int ID);	//retrieve
	void removeEmployee(Employee emp);	//delete
}