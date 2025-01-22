import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f1 = new FileReader("book.txt");
			FileWriter f2 = new FileWriter("new.txt");
			int c;
			while((c=f1.read())!=-1) {
				System.out.println((char)c);
				f2.write((char)c);
			}
			f1.close();
			f2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
