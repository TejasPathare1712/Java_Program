import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DatabaseMetaDataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			DatabaseMetaData dbmt = con.getMetaData();
			System.out.println(dbmt.getDriverMajorVersion());
			System.out.println(dbmt.getDatabaseProductVersion());
			System.out.println(dbmt.getDatabaseProductName());
			}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
