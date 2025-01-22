
public class MethodOverloadArea {
		public void area(int radius) {
			System.out.println("Area of Circle = "+3.14*radius*radius);
		}
		public void area(int l,int b) {
			System.out.println("Area of Rectangle = "+l*b);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadArea m1 = new MethodOverloadArea();
		m1.area(10);
		m1.area(10, 20);
	}

}
