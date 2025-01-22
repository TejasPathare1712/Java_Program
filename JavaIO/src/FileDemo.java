import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("book.txt");
		System.out.println(f1.exists());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.length());
		

	}

}
