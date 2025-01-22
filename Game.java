import java.util.Scanner;
import java.lang.Math.*;
class Game{
	public static void main(String args[]){
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number from 1 to 10");
		no=sc.nextInt();
		int luckyno=(int)(Math.random()*10);
		System.out.println("The lucky number is = "+ luckyno);
		if(no==luckyno){
			System.out.println("Congratualtion you are winner !");
		}else{
			System.out.println("Better Luck Next time");
                 }
 	}
}