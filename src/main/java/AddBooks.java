import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Author;
import entities.Book;
import entities.Course;
import entities.Job;

public class AddBooks {

	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		s.beginTransaction();
		
		Author a1 = new Author();
		a1.setName("Gavin King");
			
		Author a2 = new Author();
		a1.setName("Christpher");
		
		Book b1 = new Book();
		b1.setTitle("Hibernate");
		
		a1.getBooks().add(b1);
		a2.getBooks().add(b1);
		
		b1.getAuthors().add(a1);
		b1.getAuthors().add(a2);
		
		
//		s.save(a1);
//		System.out.println("Added Author 1");
//		s.save(a2);
//		System.out.println("Added Author 2");
		
		s.save(b1);
		System.out.println("Added Book 1");
		s.getTransaction().commit();
		
		s.close();
		sf.close();
	}
}
