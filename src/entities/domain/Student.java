package entities.domain;

public class Student extends User implements Comparable<Student> {

	public Student() {
	}

	public Student(Integer id) {
		super(id);
	}
	
	@Override
	public String toString() {
		return super.getId().toString();
	}

	@Override
	public int compareTo(Student other) {
		return  super.getId().compareTo(other.getId());
	}
	
}
