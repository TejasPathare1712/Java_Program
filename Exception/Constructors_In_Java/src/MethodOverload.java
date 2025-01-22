
public class MethodOverload {
		public void show() {
			System.out.println("Hello World");
		}
		public void show(int no) {
			System.out.println(no);
		}
		public void show(String msg) {
			System.out.println(msg);
		}
		public void show(String msg,int no) {
			for(int i=0;i<=no;i++) {
				System.out.println(msg);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload m1 = new MethodOverload();
		m1.show();
		m1.show(10);
		m1.show("Good Morning");
		m1.show("Tejas", 10);
		

	}

}
