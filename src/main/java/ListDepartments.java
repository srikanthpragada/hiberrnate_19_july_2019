import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entities.Department;
import entities.Employee;

public class ListDepartments {

	public static void main(String[] args) throws Exception {
		Configuration c = new Configuration();
		c.configure();

		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();

		Query q = s.createQuery("from Department"); // HQL

		for (Department d : (List<Department>) q.list()) {
			System.out.println(d.getName());
			for(Employee e : d.getEmployees())
				System.out.println(e.getName());
		}

		s.close();
		sf.close();
	}
}
