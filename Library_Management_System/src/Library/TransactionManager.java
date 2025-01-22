package Library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;

public class TransactionManager {
    public void issueBook(int memberId, int bookId) {
        String query = "INSERT INTO transactions (member_id, book_id, issue_date) VALUES (?, ?, ?)";
        String updateBookQuery = "UPDATE books SET quantity = quantity - 1 WHERE book_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(query);
             PreparedStatement updateStmt = con.prepareStatement(updateBookQuery)) {
            stmt.setInt(1, memberId);
            stmt.setInt(2, bookId);
            stmt.setDate(3, new Date(System.currentTimeMillis()));
            stmt.executeUpdate();

            updateStmt.setInt(1, bookId);
            updateStmt.executeUpdate();
            System.out.println("Book issued successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void returnBook(int transactionId) {
        String query = "UPDATE transactions SET return_date = ? WHERE transaction_id = ?";
        String updateBookQuery = "UPDATE books SET quantity = quantity + 1 WHERE book_id = " +
                "(SELECT book_id FROM transactions WHERE transaction_id = ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(query);
             PreparedStatement updateStmt = con.prepareStatement(updateBookQuery)) {
            stmt.setDate(1, new Date(System.currentTimeMillis()));
            stmt.setInt(2, transactionId);
            stmt.executeUpdate();

            updateStmt.setInt(1, transactionId);
            updateStmt.executeUpdate();
            System.out.println("Book returned successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

