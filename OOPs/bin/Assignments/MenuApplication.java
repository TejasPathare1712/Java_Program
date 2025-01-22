import java.util.Scanner;
class MenuApplication{
	public static void main(String args[]){
		int ch;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("1. Addition of two numbers");
			System.out.println("2. Substration of two numbers");
			System.out.println("3. Multiplication of two numbers");
			System.out.println("4. Division of two numbers");
			System.out.println("5. modulus of two numbers");
			System.out.println("6. Exit");
			System.out.println("Enter First Number");
			int a=sc.nextInt();
			System.out.println("Enter Second Number");
			int b=sc.nextInt();
			
			


			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			switch(ch){
				case 1: System.out.println("Adddition = " + (a + b));
				break;
				case 2: System.out.println("Substraction = " + (a-b));
				break;
				case 3: System.out.println("Multiplication = "+ (a*b));
				break;
				case 4: System.out.println("Division = "+ (a/b));
				break;
				case 5: System.out.println("Remainder = "+ (a%b));
				break;
				default: System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=6);
			System.out.println("Program Exited Succesfully");
			
	}
}