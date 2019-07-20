import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entities.Job;

public class ListJobs {

	public static void main(String[] args) throws Exception {
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
        
		Query q = s.createQuery("from Job"); // HQL 
        System.out.println("About to execute query!");
        
		for(Job j : (List<Job>) q.list()) {
			if(j.getMinSal() > 5000)
			   System.out.printf("%-10s  - %s\n", j.getId(), j.getTitle());
		}
		s.close();
		sf.close();
	}
}
