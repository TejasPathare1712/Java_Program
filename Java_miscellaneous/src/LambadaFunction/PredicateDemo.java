package LambadaFunction;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = I -> (I>10);
		System.out.println(p.test(100));
		System.out.println(p.test(10));

	}

}
 