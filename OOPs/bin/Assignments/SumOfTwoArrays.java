//Write a Program to accept 2 arrays of 10 elements each and print the new array having sum of two arrays.
import java.util.Scanner;
class SumOfTwoArrays{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of first Arrays");
		int arr[]= new int[10];
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//for(int x = arr[i]){
		//	System.out.print(x);
		//}
		System.out.println("Enter the values of Second");
		for(int j=0;j<10;j++){
			arr[j]=sc.nextInt();
		}
		for(int j=0;j<10;j++){
			System.out.print(arr[j]+" ");
		}

		//foreach(int y = arr[j]){
		//	System.out.print(y);
		//}
		

	}
}