import java.util.Scanner;
class MenuBar2{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("-------Menu Bar--------");
			System.out.println("1. Area of square ");
			System.out.println("2. Area of Rectangle ");			
			System.out.println("3. Area of circle ");
			System.out.println("4. Volume of cube ");
			System.out.println("5. Exit");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			switch(choice){
				case 1: System.out.println("Enter the value of side of square");
					int a = sc.nextInt();
					System.out.println("Area of square = "+ (a*a));
					break;
				case 2: System.out.println("Enter the value of side of rectangle");
					int a1 = sc.nextInt();
					int b1 = sc.nextInt();
					System.out.println("Area of rectangle = "+ 0.5*(a1*b1));
					break;
				case 3: System.out.println("Enter the value of radius of circle");
					int r = sc.nextInt();
					System.out.println("Area of Circle = "+ 3.14*(r*r));
					break;
				case 4: System.out.println("Enter the value of edge  of cube");
					int c = sc.nextInt();
					System.out.println("Volume of cube = "+ (c*c*c));
					break;
			}
		}while(choice!=5);
			System.out.println("Program is Exit");
	}
}
