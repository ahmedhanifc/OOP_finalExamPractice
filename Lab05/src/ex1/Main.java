package ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course INFS3102 = new Course("INFS3102", "OOP");
		UniversityManagement.addCourse(INFS3102);
		UniversityManagement.enrollStudentInCourse(new Student("Ahmed", "Hanif", "2003-03-05"), INFS3102);
		UniversityManagement.enrollStudentInCourse(new Student[] {
				new Student("Hafsa", "Farhan", "2003-09-19", new double[] {90,80,70}),
				new Student("Usman", "Hanif", "Old man")
		}, INFS3102);
		
		
		INFS3102.displayStudents();
	}

}
