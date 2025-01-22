import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadRecordDemo  {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = MyConnection.getConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from user where username=? and password=?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name and Password");
	    String un = sc.next();
	    String pwd = sc.next();
	    pstmt.setString(1, un);
	    pstmt.setString(2, pwd);
	    //step 4
	    ResultSet rs = pstmt.executeQuery();
	    if(rs.next()) {
	    	System.out.println("Valid Username and Password");
	    }
	    else {
	    	System.out.println("Invalid Username and Password");
	    }

	}

}
