import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList();
		list1.addFirst(12);
		list1.addLast(18);
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList();
		list2.addFirst(12);
		list2.addLast(19);
		list2.add(55);
		System.out.println(list2);
		
		Iterator i1 = list1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		ListIterator i2 = list2.listIterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		ListIterator l2 = list2.listIterator(list1.size());
		while(l2.hasPrevious()) {
			System.out.println(l2.previous());
		}
		
	}

}
