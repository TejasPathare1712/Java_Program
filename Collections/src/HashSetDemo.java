import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s1 = new HashSet();
		s1.add(45);
		s1.add(90);
		s1.add(15);
		s1.add(90);
		s1.add(45);
		s1.add(324);
		s1.add(61);
		//Set is a built in interface
		//set does not allow duplicates
		//And Order is not fix 
		// There is no method get in set
		Iterator i1 = s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		

	}

}
