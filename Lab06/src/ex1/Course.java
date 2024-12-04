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

	public Student searchStudent(String firstName, String lastName) {
		if (students.isEmpty())
			return null;
		for (Student student : students) {
			if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
				return student;
			}
		}
		return null;
	}

	public void displayStudents() {
		if (students.isEmpty())
			return;
		for (Student student : students) {
			if (student.calculateAverage() == 0) {
				System.out.printf("%s, %s, Still didn't receive any grade\n", student.getFirstName(),
						student.getLastName());
			} else {
				System.out.printf("%s, %s, Average Grade is: %f\n", student.getFirstName(), student.getLastName(),
						student.calculateAverage());
			}
		}
	}

	public void displayStudentGradeLevel() {
		if (students.isEmpty()) return;
		System.out.printf("Students Grade level for course %s\n", this.getCode());
		for (Student student : students) {
			System.out.printf("%s, %s, Grade, %s: %s\n", student.getFirstName(), student.getLastName(), student.getGradeLevel().name(),student.getGradeLevel().message);
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
