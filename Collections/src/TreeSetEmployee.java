import java.util.TreeSet;

public class TreeSetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> t1 = new TreeSet<Employee>();
		t1.add(new Employee(101,"Megha",87600));
		t1.add(new Employee(102,"Vinit",75000));
		t1.add(new Employee(103,"Rahul",80000));
		System.out.println(t1.toString());


	}

}
