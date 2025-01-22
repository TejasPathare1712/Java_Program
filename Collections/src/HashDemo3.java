import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>h1 = new HashMap<Integer,String>();
		h1.put(12, "Tejas");
		h1.put(14, "Isha");
		h1.put(16, "Uma");
		h1.put(18, "Asha");
		System.out.println(h1);
		Set s1=h1.entrySet();
		Iterator i1 =s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
