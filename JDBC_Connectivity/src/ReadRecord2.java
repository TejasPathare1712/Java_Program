import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadRecord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = MyConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select  * from student1");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+rs.getString("name")+rs.getInt("marks"));
				
			}
			}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
