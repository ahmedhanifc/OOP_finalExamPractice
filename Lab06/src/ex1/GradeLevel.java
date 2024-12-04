package ex1;

public enum GradeLevel {
	DIPLOMA("I am hoping to go to another country"), UNDERGRADUATE("I am a little stupid"), POSTGRADUATE("I am a little smart");
	
	String message;

	private GradeLevel(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
}
