package LambadaFunction;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []a1 = {10,20,30,40,50};
		//For Each Loop
		for(Integer n:a1) {
			System.out.println(n);
		}
		List a2 = Arrays.asList(a1);
		//For Each Method
		a2.forEach(n->System.out.println(n));

	}

}
