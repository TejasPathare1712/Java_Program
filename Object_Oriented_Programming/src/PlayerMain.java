
public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player(1001,"Rohit Sharma","Cricket");
		Player p2 = new Player(1001,"Rohit Sharma","Cricket");
		// == this operator always compares the references;
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		
		

	}

}
