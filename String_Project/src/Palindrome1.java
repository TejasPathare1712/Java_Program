import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		s1=sc.nextLine();
		StringBuffer s2 = new StringBuffer(s1);
		s2.reverse();
		if(s1.equals(s2)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
