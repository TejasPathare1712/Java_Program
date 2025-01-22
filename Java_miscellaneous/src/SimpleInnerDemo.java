
public class SimpleInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass ol = new OuterClass();
		ol.display();
		OuterClass.InnerClass i1 = ol.new InnerClass();
		i1.show();

	}

}
