package LambadaFunction;

public class LambadaExpressionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width =10;
		//with lambada
		Drawable d2 = ()->{
			System.out.println("Drawing ="+width);
		};
		d2.draw();

	}

}
