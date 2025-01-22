package LambadaFunction;

public class LambadaStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello World";
		Reversable r1 = (s2)->{
			StringBuilder sb1 = new StringBuilder(s2);
			sb1.reverse();
            return(sb1.toString());
		};
		System.out.println(r1.reverseIt(s1));

	}

}
