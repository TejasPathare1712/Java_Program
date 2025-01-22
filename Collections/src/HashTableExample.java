import java.util.HashMap;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Book> map = new HashMap<Integer,Book>();
		Book b1 = new Book(101,"Atomic habits","James Clear","Navneet",12);
		Book b2 = new Book(102,"Atomic habits","Power Of Subconsious Mind","Nikita",15);
		Book b3 = new Book(103,"Operating System","Galvin","Wiley",6);
		
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		for(Map.Entry<Integer,Book> entry:map.entrySet()) {
			int key = entry.getKey();
			Book b = entry.getValue();
			System.out.println(key+"Details");
			System.out.println(b.id + " "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
			}

	}

}
