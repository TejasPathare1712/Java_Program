package Library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberManager {
    public void addMember(String name, String email) {
        String query = "INSERT INTO members (name, email) VALUES (?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.executeUpdate();
            System.out.println("Member added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewMembers() {
        String query = "SELECT * FROM members";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.printf("ID: %d, Name: %s, Email: %s%n",
                        rs.getInt("member_id"), rs.getString("name"), rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
