package query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ListTitles {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		Session session = c.buildSessionFactory().openSession();

		List<Title> titles = session.createQuery("from Title t where t.price > 500").list();
		for (Title t : titles) {
			//System.out.printf("%-30s  %-20s  %d\n", t.getTitle(),
			//		 t.getSubject().getSubname(), t.getPrice());
			System.out.printf("%-30s %d\n", t.getTitle(),t.getPrice());
		}
		session.close();
	}
}
