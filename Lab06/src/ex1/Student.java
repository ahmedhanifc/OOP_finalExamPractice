package ex1;

import java.util.Arrays;
import java.util.Objects;

public class Student {
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	double[] grades = new double[3];
	private GradeLevel gradeLevel;
	
	public Student(String firstName, String lastName, GradeLevel gradeLevel) {
		this(firstName, lastName,gradeLevel,null,null);
	}
	public Student(String firstName, String lastName,GradeLevel gradeLevel,String dateOfBirth, double[] grades) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.grades = grades;
		this.gradeLevel = gradeLevel;
	}
	public GradeLevel getGradeLevel() {
		return gradeLevel;
	}
	public void setGradeLevel(GradeLevel gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	public Student(String firstName, String lastName, GradeLevel gradeLevel,String dateOfBirth) {
		this(firstName,lastName, gradeLevel,dateOfBirth,new double[3]);
	}
	public double calculateAverage() {
		double sum = 0;
		int counter = 0;
		
		for(double grade:grades) {
			if(grade!=0) {
				sum+=grade;
				counter++;
			}
		}
		if(sum == 0) return 0;
		return sum / counter;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getFirstName() {
		return firstName;
	}
	public double[] getGrades() {
		return grades;
	}
	public String getLastName() {
		return lastName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, firstName, lastName);
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setGrades(double[] grades) {
		this.grades = grades;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", grades=" + Arrays.toString(grades) + ", gradeLevel=" + gradeLevel + "]";
	}
	
	
	
	
	
	

}
