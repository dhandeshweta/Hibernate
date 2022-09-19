package com.cg.client;

import com.cg.entities.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImplementation;

public class client {

	public static void main(String[] args) {
		//Lazy initialization- interface on the LHS and 
		//on RHS, there is implementation class constructor
		EmployeeService service = new EmployeeServiceImplementation();
		Employee emp = new Employee();
		
		//create operation
		emp.setID(115);
		emp.setNAME("Iron Man");
		service.addEmployee(emp);
		
		/*//retrieve a data
		emp = service.getEmployeeById(112);
		System.out.println("Emp ID: " +emp.getID());
		System.out.println("Emp Name: " +emp.getNAME());*/
		
		/*//update a data
		emp = service.getEmployeeById(114);
		emp.setNAME("Thanos");
		service.updateEmployee(emp);*/
		
		/*//delete a data
		emp = service.getEmployeeById(113);
		service.removeEmployee(emp);*/
	}

}