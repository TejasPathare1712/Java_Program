
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABcdefHnL";
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			int ch = (int)str.charAt(i);
			if(ch>=65 && ch<=90) {
				sum=sum+ch;
			}
		}
		System.out.println("The sum is = " + sum);
		

	}

}
