import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a1 = {36,65,76,457,35};
		List list1 = Arrays.asList(a1);
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);

	}

}
