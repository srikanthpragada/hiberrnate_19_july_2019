import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entities.Author;
import entities.Book;

public class ListBooks {

	public static void main(String[] args) throws Exception {
		Configuration c = new Configuration();
		c.configure();

		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();

		Query q = s.createQuery("from Book"); // HQL

		for (Book b : (List<Book>) q.list()) {
			System.out.println(b.getTitle());
			for(Author a : b.getAuthors())
				System.out.println(a.getName());
		}

		s.close();
		sf.close();
	}
}
