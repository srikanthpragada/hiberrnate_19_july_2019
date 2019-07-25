package entities;

import java.util.LinkedHashSet;
import java.util.Set;

public class Course {
	private int id;
	private String title;
	private int fee;
	private Set<String> topics = new LinkedHashSet<String>();

	public int getId() {
		return id;
	}

	public Set<String> getTopics() {
		return topics;
	}

	public void setTopics(Set<String> topics) {
		this.topics = topics;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

}
