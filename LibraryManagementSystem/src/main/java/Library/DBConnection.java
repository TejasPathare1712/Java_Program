package Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/library_management_system?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root"; // Replace with your MySQL username
    private static final String PASSWORD = "root"; // Replace with your MySQL password

    public static Connection getConnection() {
        try {
            // Load the MySQL JDBC Driver (required in plain Java projects)
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found. Include the driver JAR in your project.");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database. Check your connection details.");
            e.printStackTrace();
            return null;
        }
    }
}
