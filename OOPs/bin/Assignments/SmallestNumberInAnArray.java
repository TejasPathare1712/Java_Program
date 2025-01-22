/* Assignment no 1
Problem statement 4 Write a program to accept array of 10 elements and print the Smallest  number in An Array..*/
import java.util.Scanner;
class SmallestNumberInAnArray{
	public static void main(String args[]){
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
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
						
		}
		System.out.println("Largest Number in An Array is "+ min);

	}
}
//1 2 3 5 4