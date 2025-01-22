//inner class
//4 types -> Simple Inner,Static Inner,method local Inner
//Anonymous
public class OuterClass {
	//All Members including private member of OuterClass
	//Are Available to inner class
	private int no=4;
	public void display() {
		System.out.println("Good Morning");
		
	}
	class InnerClass{
		public void show() {
			//Accessing private member of outer class inside
			//Inner class
			System.out.println(no);
		}
	}

}
