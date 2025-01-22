import java.util.Scanner;
class DoWhileDemo{
	public static void main(String args[]){
		int sum=0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int no;
		do{
			no=sc.nextInt();
			sum = sum + no;
			System.out.println("Do you want to add another number? Y/N");
			ch=sc.next().charAt(0);
		}while(ch=='Y'|| ch=='y');
		System.out.println("Sum of all entered numbers = "+sum);
	
	}
}