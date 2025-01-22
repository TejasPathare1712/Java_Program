
public class InvalidMarksException extends RuntimeException {
	String message;
	

	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public InvalidMarksException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String toString() {
		return "InvalidMarksException [message=" + message + "]";
	}
	

}
