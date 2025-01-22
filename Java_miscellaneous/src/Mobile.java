
public class Mobile {
	//method local inner class
	public void test() {
		class Cover{
			public void show() {
				System.out.println("Mobile Cover");
			}
		}
		Cover c1 = new Cover();
		c1.show();
	}

}
