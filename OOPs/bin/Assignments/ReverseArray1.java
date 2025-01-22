/* Assignment no 1
Problem statement Write a program to accept array of 10 elements and print them in reverse order.*/
import java.util.Scanner;
class ReverseArray1{	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element in an Array");
		int arr[]=new int[10];
		for(int i=0;i<=9;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Arrays Value Enter by user");
		for(int i=0;i<=9;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		
	
		System.out.println(" Reverse of given Array");
		for(int i=9;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		
	}
}