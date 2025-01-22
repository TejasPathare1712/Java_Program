
public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = "Hello";
		
		char [] a = {'a','b','c','d','e'};
		String s3 = new String(a);
		System.out.println(s3);
		System.out.println(s3.length());
		
		char [] n = {'t','p','x'};
		System.out.println(n.length);
		
		System.out.println(s3.charAt(2));
		System.out.println(s3.codePointAt(1));
		System.out.println(s3.compareTo(s2));
	}

}
