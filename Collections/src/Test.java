import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Test {
	static void removeDuplicates(int []a) {
		List list1 = Arrays.asList(a);
		LinkedHashSet s1 = new LinkedHashSet();
		for(int i=0; i<list1.size();i++) {
			s1.add(a[i]);
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a1 = {10,20,30,40,50};
		removeDuplicates(a1);

	}

}
