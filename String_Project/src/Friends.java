import java.util.Scanner;

public class Friends {
	public static void friends(String[]a) {
		int i;
		String n = null;
		for(i=0;i<a.length;i++) {
			if((a[i].length())==5) {
				n=a[i];
				System.out.println("The Names are:"+ n);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String []a = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 names");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextLine();
		}
		friends(a);

	}

}
