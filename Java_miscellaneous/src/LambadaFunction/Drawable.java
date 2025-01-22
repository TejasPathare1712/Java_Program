package LambadaFunction;

public interface Drawable {
	public void draw();
	default public void show() {
		//static as well method allow in interface
		System.out.println("Java 8 Feature");
	}
	static public void display() {
		System.out.println("This is static method in interface");
	}
	

}
