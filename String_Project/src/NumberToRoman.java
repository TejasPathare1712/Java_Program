
public class NumberToRoman {
	public static void roman(int no) {
		String rm = "MDCLXVI";
		int a[]= {1000,500,100,50,10,5,1};
		int count = 0;
		while(no>0) {
			int d = no/a[count];
			for(int i=1;i<=d;i++) {
				System.out.print(rm.charAt(count));
			}
			no = no%a[count];
			count++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 95;
		roman(number);

	}

}
