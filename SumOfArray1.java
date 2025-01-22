/* Assignment no 1
Problem statement 2 Write a program to accept array of 10 elements and print their sum..*/
import java.util.Scanner;
class SumOfArray1{
	public static void main(String args[]){
		int sum =0;
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element of an Array");
		for(int i=0;i<=9;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Array Enter by User");
		for(int i=0;i<=9;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<=9;i++){
			sum = sum + arr[i];
		}
		System.out.println("The Sum of All  array is = " + sum);

		
	}
}
