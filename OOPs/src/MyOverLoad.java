
public class MyOverLoad {
	//
	public void showMessage() {
		System.out.println("Good Afternoon");
	}
	public void showMessage(String msg) {
		System.out.println(msg);
	}
	public void showMessage(String msg,int n) {
		for(int i=1;i<n;i++) {
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOverLoad a1 = new MyOverLoad();
		a1.showMessage();
		a1.showMessage("have a nice day");
		a1.showMessage("Be Confident", 010);

	}

}
