import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Job;

public class UpdateJob {

	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		System.out.println("About to get()");
		Job job = s.load(Job.class,  "IT_PROG");
		System.out.println(job.getClass());
		if (job == null)
			System.out.println("Sorry! Job not found!");
		else
		{
			System.out.println("About to change");
			job.setTitle("IT Developer");
		}
		
		System.out.println("About to commit");
		s.getTransaction().commit();
		s.close();
		sf.close();
	}
}
