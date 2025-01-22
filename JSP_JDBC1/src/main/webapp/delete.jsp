<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete JSP</title>
</head>
<body>
    <% 
        try {
            // Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            
            // Prepare SQL statement
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM student WHERE roll = ?");
            
            // Retrieve and parse input values from the form
            int r = Integer.parseInt(request.getParameter("roll"));
            
            // Set values in the prepared statement
            pstmt.setInt(1, r);
            
            // Execute the query
            pstmt.executeUpdate();
            
            // Forward to another page
            RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            out.println("Error Occurred: " + e);
        }
    %>
</body>
</html>
