
public class Annonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 v1  = new Vehicle1() {
			public void test() {
				System.out.println("Engine oil is checked");
	            System.out.println("Coolant water is checked");
	            System.out.println("Air of all tyres is checked");
			}
		};
		v1.test();
		

	}

}
