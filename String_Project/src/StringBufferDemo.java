
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer("Hello World");
		s1.append('!');
		System.out.println(s1);
		s1.deleteCharAt(3);
		System.out.println(s1);
		System.out.println(s1.indexOf("World"));
		s1.insert(6, "sample");
		System.out.println(s1);
		System.out.println(s1.lastIndexOf("e"));
		s1.reverse();
		System.out.println(s1);
		

	}

}
