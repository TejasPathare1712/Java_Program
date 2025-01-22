import java.util.Scanner;

public class ExceptionDemo1 {
	public void show() {
		int a,b;
		System.out.println("Enter any two numbers");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition"+(a+b));
		try {
			System.out.println("Division"+(a/b));
		}
		catch(ArithmeticException e) {
			//System.out.println(e);
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println("you are trying to divide by zero");
		}
		
		System.out.println("Multiplication"+a*b);
		System.out.println("Substraction"+ (a-b));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo1 e1 = new ExceptionDemo1();
		e1.show();
	}

}
