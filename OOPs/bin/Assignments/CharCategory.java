import java.util.Scanner;
class CharCategory{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character");
		char ch = sc.next().charAt(0);
		
		if(ch>='A'&& ch<='Z'){
			System.out.println("Uppecase Letter");
		}else if(ch>='a'&& ch<='z'){
			System.out.println("Lowercase Letter");
		}else if(ch>='0'&& ch<='9'){
			System.out.println("Number");
		}else{
			System.out.println("special Symbol");
		}



	}
}