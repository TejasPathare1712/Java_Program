import java.util.Scanner;
class OddNumber1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number a");
		int a=sc.nextInt();
		System.out.println("Enter Number b");
		int b=sc.nextInt();
		if(a<b)
		{
   			for(int i=a;i<=b;i++){
				if(i%2!=0){
				System.out.println(i);
				}
			}
		}
		else
		{
   			for(int i=a;i>=b;i--){
				if(i%2!=0){
				System.out.println(i);
				}
			}
		}

	}
}