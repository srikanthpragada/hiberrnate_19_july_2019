import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Course;
import entities.Job;

public class AddCourse {

	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		s.beginTransaction();
		
		Course crs = new Course();
		crs.setTitle("Python");
		crs.setFee(5000);
		crs.getTopics().add("Data Structures");
		crs.getTopics().add("OOP");
		
		s.save(crs);
		s.getTransaction().commit();
		s.close();
		sf.close();
	}
}
