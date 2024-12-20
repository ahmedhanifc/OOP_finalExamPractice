package ex1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
	private String code;
	private String name;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public Course(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public void displayStudents() {
		if (students.isEmpty()) return;
		for(Student student: students) {
			if(student.calculateAverage()==0) {
				System.out.printf("%s, %s, Still didn't receive any grade\n", student.getFirstName(), student.getLastName());
			}
			else {				
				System.out.printf("%s, %s, Average Grade is: %f\n", student.getFirstName(), student.getLastName(), student.calculateAverage());
			}
		}
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(code, other.code);
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	@Override
	public int hashCode() {
		return Objects.hash(code);
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Course [code=" + code + ", name=" + name + "]";
	}
	
	
}


