//write a program to accept 10 numbers in an array stored in an array and print the sum of all numbers which is divisible by 5 only
import java.util.Scanner;
class SumOfArray2{
	        
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
	
	}

}