
public class InvalidBalanceException extends RuntimeException {
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public InvalidBalanceException() {
		super();
	}

	public InvalidBalanceException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InvalidBalanceException [msg=" + msg + "]";
	}
	

}
