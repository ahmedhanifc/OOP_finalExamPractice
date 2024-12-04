package ex1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class UniversityManagement {
	private static HashMap<String, Course> courses = new HashMap<String, Course>();
	private static ArrayList<Student> students = new ArrayList<Student>();
	private static int countStudents = 0;
	private static int countCourses = 0;
	
	public static void addCourse(Course course) {
		if(course == null) return;
		if(courses.containsKey(course.getCode())) return;
		courses.put(course.getCode(), course);
		incrementCourses();
		System.out.printf("Course:%s has been successfully added\n", course.getCode());
	}
	public static void removeCourse(String courseCode) {
		if(courseCode.trim().length()==0) return;
		if(courses.get(courseCode) == null ) return;
		courses.remove(courseCode);
		decrementCourses();
		System.out.printf("Course:%s has been successfully removed\n", courseCode);
		return;
	}
	public static void addStudent(Student student) {
		if(student==null) return;
		if(students.contains(student)) return;
		students.add(student);
		incrementStudents();
		System.out.printf("Student: has been successfully added\n", student.getFirstName());
	}
	public static void enrollStudentInCourse(Student student, Course course) {
		if(student==null) return;
		if(course==null) return;
		if(courses.get(course.getCode())== null) return; //What sort of value do I get here if course doesnt exist?
		if(course.getStudents().contains(student)) return;
		
		course.getStudents().add(student);
		incrementStudents();
		System.out.printf("Student: %s has been successfully added to Course: %s\n", student.getFirstName(), course.getCode());
	}
	public static void enrollStudentInCourse(Student[] students, Course course) {
		if(students.length==0) return;
		if(course==null) return;
		for(Student student:students) enrollStudentInCourse(student, course);
	}
	public static String unenrollStudentInCourse(String firstName, String lastName, Course course) {
		if(firstName.trim().length() == 0) return "Invalid First Name";
		if(lastName.trim().length() == 0) return "Invalid Last Name";
		if(course == null) return "Null Course";
		if(courses.get(course.getCode()) == null) return "Course Not Found";
		Student student = course.searchStudent(firstName, lastName);
		if(student == null) return "Null Student";
		
		course.getStudents().remove(student);
		decrementStudents();
		return String.format("Student: %s has been unenrolled from course: %s\n", student.getFirstName(), course.getCode());
	}
	public static void incrementStudents() {
		countStudents++;
	}
	public static void incrementCourses() {
		countCourses++;
	}
	public static void decrementStudents() {
		countStudents--;
	}
	public static void decrementCourses() {
		countCourses--;
	}
	
	public static void courseInventory() {
		System.out.println("**********************************");
		System.out.println("Total Number of Courses: " + countCourses);
		System.out.println("Total Number of Students: " + countStudents);
		System.out.println("**********************************");

	}

}
