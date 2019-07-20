import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Job;

public class DeleteJob {

	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		Job job = s.get(Job.class,  "JEP");
		if (job == null)
			System.out.println("Sorry! Job not found!");
		else
		{
			s.delete(job);
		}
		
		s.getTransaction().commit();
		s.close();
		sf.close();
	}
}
