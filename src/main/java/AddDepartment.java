import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Course;
import entities.Department;
import entities.Employee;
import entities.Job;

public class AddDepartment {

	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		s.beginTransaction();
		
		Department d = new Department();
		d.setName("Sales");
	
		s.save(d);
		
		Employee e1 = new Employee();
		e1.setName("Scott");
		e1.setDepartment(d);
		s.save(e1);
		
		Employee e2 = new Employee();
		e2.setName("Jason");
		e2.setDepartment(d);
		s.save(e2);
		
		s.getTransaction().commit();
		s.close();
		sf.close();
	}
}
