
public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageThread t1 = new MessageThread();
		TableThread t2 = new TableThread();
		t1.start();
		t2.start();

	}

}
