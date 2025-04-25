package practice.hiber2.Mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory fact = configuration.buildSessionFactory();
		Session session = fact.openSession();
		session.beginTransaction();
		
		// Creating 2 person objects 
		Person1 p1 = new Person1();
		Person1 p2 = new Person1();

		// Creating 2 bike object for p1 object
		Bike b1 = new Bike(1001, "Hero", 75000, p1);
		Bike b2 = new Bike(2002, "Honda", 80000, p1);

		// Creating 2 bike object for p2 object
		Bike b3 = new Bike(3003, "Pulsur", 95000, p2);
		Bike b4 = new Bike(4004, "Dominar", 99000, p2);

		// Adding Bike objects to first Single ArrayList<Bike>
		List<Bike> bikeList1 = new ArrayList<Bike>();
		bikeList1.add(b1);
		bikeList1.add(b2);

		// Adding Bike objects to second Single ArrayList<Bike>
		List<Bike> bikeList2 = new ArrayList<Bike>();
		bikeList2.add(b3);
		bikeList2.add(b4);

		// Set Id, Name and ListOfBikes to p1 object
		p1.setId(1);
		p1.setName("Mahi");
		p1.setBikeList(bikeList1);

		// Set Id, Name and ListOfBikes to p2 object
		p2.setId(2);
		p2.setName("Rahul");
		p2.setBikeList(bikeList2);

		// Saving 2 person objects p1 & p2
		session.persist(p1);
		session.persist(p2);

		// Saving bike objects b1, b2, b3 & b4
		session.persist(b1);
		session.persist(b2);
		session.persist(b3);
		session.persist(b4);

		// getting the transaction and commit transaction (saving transaction)
		session.getTransaction().commit();
	}

}
