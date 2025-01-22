
public class Vehicle1 {
	public void test() {
		System.out.println("Vehicle Testing");
	}
	class Car1 extends Vehicle1{
		public void test() {
            System.out.println("Engine oil is checked");
            System.out.println("Coolant water is checked");
            System.out.println("Air of all tyres is checked");
            
        }
	}

}
