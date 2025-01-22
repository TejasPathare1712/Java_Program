
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			//Step 3 create statement
			Statement stmt = con.createStatement();	
			//Step 4 Execute the query
			stmt.executeUpdate("create table if not exists student2(roll int,name varchar(255),marks int)");
			System.out.println("Table is created");
			
			//step 5
			con.close();
		}
		catch(ClassNotFoundException e1) {
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		
	}

}
