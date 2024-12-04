package ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course INFS3102 = new Course("INFS3102", "OOP");
		Course INFS3201 = new Course("INFS3201", "Web 2");
		UniversityManagement.addCourse(INFS3102);
		UniversityManagement.addCourse(INFS3201);
		UniversityManagement.enrollStudentInCourse(new Student("Ahmed", "Hanif", GradeLevel.UNDERGRADUATE,"2003-03-05"), INFS3102);
		UniversityManagement.enrollStudentInCourse(new Student[] {
				new Student("Hafsa", "Farhan", GradeLevel.UNDERGRADUATE,"2003-09-19", new double[] {90,80,70}),
				new Student("Usman", "Hanif", GradeLevel.UNDERGRADUATE,"Old man")
		}, INFS3102);
		
		System.out.println(UniversityManagement.unenrollStudentInCourse("Ahmed", "Hanif", INFS3102));
		INFS3102.displayStudents();
		UniversityManagement.removeCourse("INFS3201");
		
		UniversityManagement.courseInventory();
		INFS3102.displayStudentGradeLevel();
	}

}
