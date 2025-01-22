import java.util.Scanner;
class ArraySort{
// [ 18     12    23    65    37   24    76   62   79   95 ]
        //   a[0]  a[1]  a[2]  a[3]  a[4] a[5]  a[6] a[7] a[8] a[9] //  i      j    temp
        //  1      0      65 
public void bubbleSort(int a[]){

	int temp;
	for(int i=0;i<10;i++){
		for(int j=0;j<9-i;j++){
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		System.out.println(a[i]);
	}
	
}
public void printArray(int a[]){
	for(int i=0;i<10;i++){
		System.out.println(a[i]+" ");
	}
}
	public static void main(String args[]){
		ArraySort as = new ArraySort();
		int a[]=new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 arrays");
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Arrays are");
		as.printArray(a);
		as.bubbleSort(a);
		System.out.println("Arrays after sorting");
		

	}
}