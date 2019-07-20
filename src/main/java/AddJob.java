import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Job;

public class AddJob {

	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		s.beginTransaction();
		
		Job j = new Job();
		j.setId("HB_PROG");
		j.setTitle("Hibernate Programmer");
		j.setMinSal(10000);
		j.setMaxSal(20000);
		
		// Object is j is Transient 
		
		s.save(j);
		// Object is j is Persistent
		
		s.getTransaction().commit();
		s.close();
		
		// Object is j is Detached 
		sf.close();
	}
}
