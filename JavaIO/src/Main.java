import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Book []b = new Book[10];
		//b[0] = new Book(1001,"Core Java","Tejas");
		FileWriter f1 = new FileWriter("book.txt");
		f1.write("1001 Core Java EBalgurusamy");
		f1.write("1002 Head First Java Kathy Siera");
		f1.write("1003 Core Java Thomas");
		f1.write("1004 Core Java EBalgurusamy");
		f1.close();

	}

}
