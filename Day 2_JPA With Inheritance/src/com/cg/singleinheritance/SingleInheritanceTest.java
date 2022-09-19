package com.cg.singleinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleInheritanceTest 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee emp = new Employee();
		emp.setNAME("Janhavi");
		emp.setSalary(25000);
		em.persist(emp);
		
		Employee emp1 = new Employee();
		emp1.setNAME("Sukanya");
		emp1.setSalary(45000);
		em.persist(emp1);
		
		Manager m = new Manager();
		m.setNAME("Shweta");
		m.setSalary(80000);
		m.setDeptName("IT");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully in the database");
		em.close();
		factory.close();
	}

}