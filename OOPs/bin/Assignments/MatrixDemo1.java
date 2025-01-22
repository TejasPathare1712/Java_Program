import java.util.Scanner;
class MatrixDemo1{
	public static void main(String args[]){

		int a[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix element");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("The given matrix is");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("Transpose of given matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}

	}
}