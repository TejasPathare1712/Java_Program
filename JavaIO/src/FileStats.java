import java.io.FileReader;

public class FileStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cp=0,cs=0,cd=0,sp=0;
		try {
			FileReader f1 = new FileReader("book.txt");
			int c;
			while((c=f1.read())!=-1) {
				System.out.println((char)c);
				if(c>=65 && c<=90) {
					cp++;
				}
				else if(c>=97&&c<=122) {
					cs++;
				}
				else if(c>=48 && c<=57) {
					cd++;
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
