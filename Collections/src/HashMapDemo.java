import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String ,String> h1 = new HashMap<String ,String>();
		h1.put("Name", "Rahul");
		h1.put("Address", "Pune");
		h1.put("Mobile", "9767512879");
		h1.put("Email", "pathare3232tejas@gmail.com");
		System.out.println(h1);
		Set s1 = h1.entrySet();
		Iterator i1 = s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		

	}

}
