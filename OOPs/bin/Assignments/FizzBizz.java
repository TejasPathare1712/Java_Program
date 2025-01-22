class FizzBizz{
	public static void main(String args[]){
		int no;
		for(no=1;no<=100;no++){
			if(no%3==0 && no%5==0){
				System.out.print(" FizzBizz ");		
			}
			else if(no%3==0){
				System.out.print(" Fizz ");
			}
			else if(no%5==0){
				System.out.print(" Bizz ");
			}
			else
			{
				System.out.print(" "+ no +" ");
			}
		}
	}
}