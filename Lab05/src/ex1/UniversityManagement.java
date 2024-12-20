package ex1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class UniversityManagement {
	private static HashMap<String, Course> courses = new HashMap<String, Course>();
	private static ArrayList<Student> students = new ArrayList<Student>();
	
	public static void addCourse(Course course) {
		if(course == null) return;
		if(courses.containsKey(course.getCode())) return;
		courses.put(course.getCode(), course);
		System.out.printf("Course:%s has been successfully added\n", course.getCode());
	}
	public static void addStudent(Student student) {
		if(student==null) return;
		if(students.contains(student)) return;
		students.add(student);
		System.out.printf("Student: has been successfully added\n", student.getFirstName());
	}
	public static void enrollStudentInCourse(Student student, Course course) {
		if(student==null) return;
		if(course==null) return;
		if(courses.get(course.getCode())== null) return; //What sort of value do I get here if course doesnt exist?
		if(course.getStudents().contains(student)) return;
		
		course.getStudents().add(student);
		System.out.printf("Student: %s has been successfully added to Course: %s\n", student.getFirstName(), course.getCode());
	}
	public static void enrollStudentInCourse(Student[] students, Course course) {
		if(students.length==0) return;
		if(course==null) return;
		for(Student student:students) enrollStudentInCourse(student, course);
	}

}
