import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add(866.460);
		a1.add("Hello");
		a1.add(true);
		System.out.println(a1);
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("---------------------------------");
		a1.add(3,96);
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("-----------------------------------");
		a1.remove(3);
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		

	}

}
