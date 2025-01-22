import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		no=sc.nextInt();
		String s1 = String.valueOf(no);
		StringBuffer s2 = new StringBuffer(s1);
		s2.reverse();
		System.out.println(s2);
		if(s1.equals(s2.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrom");
		}
	}

}
