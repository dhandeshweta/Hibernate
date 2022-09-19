package com.cg.association1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Department dept = new Department();
		dept.setId(1);
		dept.setName("Information Technology");
		
		Department dept1 = new Department();
		dept1.setId(2);
		dept1.setName("Human Resources");
		
		Employee e2 = new Employee();
		e2.setName("Sharmila");
		e2.setSalary(45000);
		e2.setDept(dept1);

		Employee e3 = new Employee();
		e3.setName("Rahul");
		e3.setSalary(65000);
		e3.setDept(dept);
		
		em.persist(e2);
		em.persist(e3);
		
		System.out.println("Added employees with department");
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}