package Library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookManager {
    public void addBook(String title, String author, int quantity) {
        String query = "INSERT INTO books (title, author, quantity) VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.setInt(3, quantity);
            stmt.executeUpdate();
            System.out.println("Book added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewBooks() {
        String query = "SELECT * FROM books";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.printf("ID: %d, Title: %s, Author: %s, Quantity: %d%n",
                        rs.getInt("book_id"), rs.getString("title"), rs.getString("author"), rs.getInt("quantity"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

