package com.cg.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee e = new Employee();
		e.setEmployeeName("Chandana");
		
		Employee e1 = new Employee();
		e1.setEmployeeName("Nikita");
		
		Address a = new Address();
		a.setAddressId(10);
		a.setStreet("Sahakar Nagar");
		a.setCity("Pune");
		a.setState("Maharashtra");
		
		Address a1 = new Address();
		a1.setAddressId(20);
		a1.setStreet("Canada Corner");
		a1.setCity("Nashik");
		a1.setState("Maharashtra");
		
		e.setAddress(a);
		e1.setAddress(a1);
		em.persist(e);
		em.persist(e1);
		System.out.println("Row Inserted");
		
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}