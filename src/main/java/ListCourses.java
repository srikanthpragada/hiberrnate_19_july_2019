import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entities.Course;

public class ListCourses {

	public static void main(String[] args) throws Exception {
		Configuration c = new Configuration();
		c.configure();

		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();

		Query q = s.createQuery("from Course"); // HQL

		for (Course course : (List<Course>) q.list()) {
			System.out.println(course.getTitle());
			for (String topic : course.getTopics())
				System.out.println(topic);
		}
		s.close();
		sf.close();
	}
}
