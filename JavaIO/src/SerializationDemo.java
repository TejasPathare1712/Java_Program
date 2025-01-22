import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(12,"Tejas","Tejas1712","Tejas2002",100);
		FileOutputStream f1 = new FileOutputStream("employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(f1);
		oos.writeObject(e1);
		System.out.println("Employee Object is Serialized");

	}
	

}
