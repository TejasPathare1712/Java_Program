import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Register the driver"
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			//Step 3 create statement
			Statement stmt = con.createStatement();	
			//Step 4 Execute the query
			stmt.executeUpdate(("insert into student values(104,'Tejas',97)"));
			System.out.println("Table is created");
			
			//step 5
			con.close();
		}
		catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		
	}

	}


