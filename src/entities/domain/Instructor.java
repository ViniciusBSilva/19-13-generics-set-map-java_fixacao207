package entities.domain;

import java.util.Set;
import java.util.TreeSet;

public class Instructor extends User {

	private String name;
	
	private Set<Course> courses = new TreeSet<>();
	
	public Instructor() {
	}

	public Instructor(Integer id) {
		super(id);
	}

	public Instructor(Integer id, String name) {
		super(id);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void addCourse (Course course) {
		courses.add(course);
	}
	
}
