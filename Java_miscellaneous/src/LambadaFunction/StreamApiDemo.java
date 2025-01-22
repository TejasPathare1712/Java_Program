package LambadaFunction;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []a1 = {10,20,30,40,50,60,77};
		List<Integer>a2 = Arrays.asList(a1);
		a2.forEach(n->System.out.println(n));
		a2.stream().map(n->n*n).forEach(n->System.out.println(n));
		a2.stream().filter(n-> n%2==0).forEach(n->System.out.println(n));

	}

}
