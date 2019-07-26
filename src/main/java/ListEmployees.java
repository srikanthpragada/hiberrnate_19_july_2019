import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entities.Employee;

public class ListEmployees {

	public static void main(String[] args) throws Exception {
		Configuration c = new Configuration();
		c.configure();

		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();

		Query q = s.createQuery("from Employee"); // HQL

		for (Employee e : (List<Employee>) q.list()) {
			System.out.println(e.getName() + " - " + e.getDepartment().getName());
		}

		s.close();
		sf.close();
	}
}
