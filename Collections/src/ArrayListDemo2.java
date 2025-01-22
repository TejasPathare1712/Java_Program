import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(33);
		list1.add(45);
		list1.add(60);
		
		Iterator i1 = list1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("-----------");
		for(Integer x:list1) {
			System.out.println(x);
		}
		System.out.println("-----------");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("------------");
		ListIterator l1 = list1.listIterator();
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
		//Collection inbuilt methods
		Collections.sort(list1);
		System.out.println(list1);
		Collections.reverse(list1);
		System.out.println(list1);

	}

}
