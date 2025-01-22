import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    try {
		FileReader f1 = new FileReader("book.txt");
		int c;
		while((c=f1.read())!=-1) {
			System.out.println((char)c);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}

}
