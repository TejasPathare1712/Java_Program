
public class Tiger extends Animal {
	String food;
	Tiger(){
		super();
	}
	public Tiger(String name, String type,String food) {
		super(name, type);
		// TODO Auto-generated constructor stub
		this.food=food;
	}
	public void test() {
		super.display();
	}

}
