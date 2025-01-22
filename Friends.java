// write a program to accept some names of your friends and strore the in an array and print only those names whose length is 5;
import java.util.Scanner;
class Friends{
	public static void Length(String s1){
		if(s1.length()==5){
			System.out.println(s1);
		}
	}
	public static void main (String args[]){
		String s1[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the names of Your friends");
		for(int i=0;i<5;i++){
			s1[i] = sc.nextLine();
		}
		

		
		


	}
}