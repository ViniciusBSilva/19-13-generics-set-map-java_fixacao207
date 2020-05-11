package application;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.domain.Course;
import entities.domain.Instructor;
import entities.domain.Student;

public class Program {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Enter Instructor Name: ");
			String instructorName = sc.nextLine();
			
			System.out.print("Enter Instructor ID: ");
			int instructorId = sc.nextInt();
			
			Instructor instructor = new Instructor(instructorId, instructorName);
			
			System.out.print("How many courses does he/she have? ");
			int coursesQuantity = sc.nextInt();
			
			for (int i = 0; i < coursesQuantity; i++) {
				
				System.out.printf("Enter course #%d Name: ", i+1);			
				String courseName = sc.next();
				
				Course course = new Course(courseName);
				instructor.addCourse(course);
				
				System.out.printf("How many students for course %s? ", course.getName());
				int studentsQuantity = sc.nextInt();
				
				System.out.printf("Enter the id for the students for course %s: %n", course.getName());
				for (int j = 0; j < studentsQuantity; j++)  {
					System.out.printf("Student #%d ID: ", j+1);
					course.addStudent(new Student(sc.nextInt()));
				}
				
			}
			
			Set<Student> students = new TreeSet<>();
			
			for (Course course: instructor.getCourses()) {
				students.addAll(course.getStudents());
			}
			
			System.out.printf("Total students: %d %n", students.size());
			System.out.println(students.toString());
			
			
		} catch (Exception e) {
			System.out.printf("%nError!: " +  e.getMessage());
		}
		
	}

}
