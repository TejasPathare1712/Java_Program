class ArrayToSingleNum{
	public static void main(String args[]){
		int arr[]={2,3,4,5,6};
		int num=0;
		for(int i=0;i<arr.length;i++){
			num=(num*10)+arr[i];
		}
		System.out.println("Combination of number is = "+ num);
	}
}