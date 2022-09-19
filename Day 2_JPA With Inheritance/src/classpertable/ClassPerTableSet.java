package classpertable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.singleinheritance.Employee;
import com.cg.singleinheritance.Manager;

public class ClassPerTableSet 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em2 = factory.createEntityManager();
		em2.getTransaction().begin();
		
		//create one employee
		Employee employee1 = new Employee();
		employee1.setNAME("Parag");
		employee1.setSalary(8000);
		em2.persist(employee1);
		
		//create one manager
		Manager manager1 = new Manager();
		manager1.setNAME("Trisha");
		manager1.setSalary(5000);
		manager1.setDeptName("Sales");
		em2.persist(manager1);
		
			
		em2.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em2.close();
		factory.close();
	}
}