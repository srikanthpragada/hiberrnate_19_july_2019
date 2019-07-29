package inh;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entities.Author;
import entities.Book;
import entities.Course;
import entities.Job;

public class ListPersons {

	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		Query q = s.createQuery("from Person"); // HQL

		for (Person p : (List<Person>) q.list()) {
			if (p instanceof Player)
			    System.out.println("Player  : " + p.getName());
			else
				System.out.println("Student : " + p.getName());
		}
		
				
		s.close();
		sf.close();
	}
}
