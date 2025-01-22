//write program to print all even numbers from a to b
import java.util.Scanner;
class EvenNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
                int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		if(a>b){
			while(a>=b){
				if(a%2==0){
					System.out.println(a);
				}
				a=a-1;
				
			}

		}
		else{
			while(a<=b){
				if(a%2==0){
					System.out.println(a);
				}
				a=a+1;
			}
		}
		

	}
}