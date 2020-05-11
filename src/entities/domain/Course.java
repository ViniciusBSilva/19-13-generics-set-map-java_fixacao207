package entities.domain;

import java.util.HashSet;
import java.util.Set;

public class Course implements Comparable<Course> {

	private String name;
	
	private Set<Student> students = new HashSet<>();
	
	public Course() {
	}

	public Course(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	@Override
	public int compareTo(Course other) {
		// TODO Auto-generated method stub
		return name.compareTo(other.getName());
	}
	
}
