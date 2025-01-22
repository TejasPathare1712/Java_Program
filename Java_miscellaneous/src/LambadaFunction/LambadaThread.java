package LambadaFunction;

public class LambadaThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TablePrintTable t1 = new TablePrintTable();
		TablePrintTable t1 = new TablePrintTable();
		Thread t3 = new Thread((java.lang.Runnable) t1);
		
		/*Thread t2 = new Thread(()->{
			for(int i=1;i<=10;i++) {
				System.out.println(5*i);
			}
		});
		t2.start();*/

	}

}
