import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Register the driver"
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			//Step 3 create statement
			//Statement stmt = con.createStatement();
			PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student roll number");
			int r = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the student name");
			String name = sc.nextLine();
			System.out.println("Enter the student marks");
			int marks = sc.nextInt();
			
			pstmt.setInt(1,r);
			pstmt.setString(2, name);
			pstmt.setInt(3, marks);
			
			//Step 4 Execute the query
			pstmt.executeUpdate();
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
