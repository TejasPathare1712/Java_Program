import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginCheck {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//Step 1:
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		//step 3
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
	    
	    }catch(Exception e) {
			e.printStackTrace();
		}
	}

}
