import java.util.Scanner;
class ArrayNew{
	public void array(){
	Scanner sc = new Scanner(System.in);
	int arr[]= new int[10];
	System.out.println("Enter the number");
	for(int i=0;i<10;i++){
		arr[i] = sc.nextInt();
	}
	System.out.println("Number Taken from User");
	for(int i=0;i<10;i++){
	System.out.print(arr[i]+" ");
	}
	System.out.println();
}		
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	        int arr[]= new int[10];
	        System.out.println("Enter the number");
		ArrayNew a1 = new ArrayNew();
		a1.array();
		

	}
}