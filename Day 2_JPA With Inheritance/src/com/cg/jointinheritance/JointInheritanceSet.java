package com.cg.jointinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.singleinheritance.Manager;

public class JointInheritanceSet {

	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em3 = factory.createEntityManager();
		em3.getTransaction().begin();
		
		//create one employee
		EmployeeK employee2 = new EmployeeK();
		employee2.setName("Sneha");
		employee2.setSalary(4000);
		em3.persist(employee2);
		
		//create one manager
		Manager manager2 = new Manager();
		manager2.setNAME("Kaushal");
		manager2.setSalary(6000);
		manager2.setDeptName("Finance");
		em3.persist(manager2);
		
		
		
		em3.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em3.close();
		factory.close();
	}
}