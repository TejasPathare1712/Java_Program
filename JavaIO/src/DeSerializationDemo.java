import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f1 = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(f1);
		Employee e1 = (Employee)ois.readObject();
		System.out.println(e1);
	}

}
