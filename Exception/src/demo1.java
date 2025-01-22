import java.util.Scanner;

public class demo1 {
//without exception handling
	public void show() {
		int a,b;
		System.out.println("Enter any two numbers");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition"+(a+b));
		System.out.println("Division"+(a/b));
		System.out.println("Multiplication"+a*b);
		System.out.println("Substraction"+ (a-b));
		
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			demo1 d1 = new demo1();
			d1.show();

	}

}
