import java.util.Scanner;
import java.lang.Math.*;
class DemoSwitch{
	public static void main(String args[]){
		int no;
		System.out.println("Enter any Number");
		Scanner sc = new Scanner(System.in);
		no=sc.nextInt();
		System.out.println("1: Square of the Number");
		System.out.println("2: Cube of the Number");
		System.out.println("3: Square root of the Number");
		System.out.println("Enter your choice");

		int ch=sc.nextInt();
		
		switch(ch){
			case 1:System.out.println("Square = "+no*no);
			break;
			case 2 :System.out.println("cube = "+no*no*no);
			break;
			case 3:System.out.println("Square root = "+Math.sqrt(no));
			break;
			default:System.out.println("Invalid Choice");
			break;

		}



	}
}