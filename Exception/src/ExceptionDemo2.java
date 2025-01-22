
public class ExceptionDemo2 {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		try {
			int k=args.length;
			int []a = {245,56,24,234};
			System.out.println(a.length/k);
			System.out.println(a[5]);
		}
		catch(ArithmeticException e) {
			System.out.println("The Command line argument"+e);
			System.out.println("Please run the code again"+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The index given is wrong");
		}
		catch(Exception e) {
			System.out.println("Some Error");
		}
		

	}

}
