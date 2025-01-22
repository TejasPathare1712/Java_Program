import java.util.Arrays;
class ArrayDemo{
	public static void main(String args[]){
		int a[]=new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		for(int i=0;i<10;i++){
			System.out.println(a[i]);
		}
		for(int j:a){
			System.out.println(j);
		}
		System.out.println(Arrays.toString(a));
	
	}
}