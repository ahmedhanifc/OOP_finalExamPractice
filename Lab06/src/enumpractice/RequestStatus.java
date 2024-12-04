package enumpractice;

public enum RequestStatus {
	GRANTED("enjoy!"), PENDING("Processing"), REFUSED("sorry!");
	private String message;
	RequestStatus(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	
}
