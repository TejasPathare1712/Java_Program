import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map Interface uses a set and ArrayList
		//to store all elements of
		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		h1.put(12, "Tejas");
		h1.put(14, "Suresh");
		h1.put(16, "Uma");
		h1.put(18, "Asha");
		Set s1 = h1.entrySet();
		Iterator i1 = s1.iterator();
		
		while(i1.hasNext()) {
			Map.Entry m1 = (Map.Entry) i1.next();
			System.out.println(m1.getKey());
			System.out.println(m1.getValue());
		}
	}

}
