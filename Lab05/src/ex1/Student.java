package ex1;

import java.util.Arrays;
import java.util.Objects;

public class Student {
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	double[] grades = new double[3];
	public Student(String firstName, String lastName, String dateOfBirth, double[] grades) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.grades = grades;
	}
	public Student(String firstName, String lastName) {
		this(firstName, lastName,null,null);
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
	public Student(String firstName, String lastName,String dateOfBirth) {
		this(firstName,lastName,dateOfBirth, new double[3]);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double[] getGrades() {
		return grades;
	}
	public void setGrades(double[] grades) {
		this.grades = grades;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", grades=" + Arrays.toString(grades) + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, firstName, lastName);
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
	
	
	
	
	
	

}
