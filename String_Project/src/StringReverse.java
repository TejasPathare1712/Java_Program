import java.util.Scanner;

public class StringReverse {
	public static String reverse(String s1) {
		int len = s1.length();		
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev = rev + s1.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		System.out.println("Enter any String ");
		Scanner sc = new Scanner(System.in);
		s1=sc.next();
		String r = reverse(s1);
		System.out.println(r);

	}

}
