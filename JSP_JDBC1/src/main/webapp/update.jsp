<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="container mt-5">
        <%
            int roll = Integer.parseInt(request.getParameter("roll"));
            String name = request.getParameter("name");
            int marks = Integer.parseInt(request.getParameter("marks"));

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
                PreparedStatement pstmt = con.prepareStatement("UPDATE student SET name = ?, marks = ? WHERE roll = ?");
                pstmt.setString(1, name);
                pstmt.setInt(2, marks);
                pstmt.setInt(3, roll);

                int rows = pstmt.executeUpdate();
                con.close();

                if (rows > 0) {
        %>
                    <div class="alert alert-success">Student record updated successfully!</div>
        <%      } else { %>
                    <div class="alert alert-danger">Failed to update student record!</div>
        <%      }
            } catch (Exception e) {
                e.printStackTrace();
        %>
                <div class="alert alert-danger">An error occurred while updating the record!</div>
        <%
            }
        %>
        <a href="show.jsp" class="btn btn-primary mt-3">Go Back</a>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-7xkUuoXiWycE0XI7ZcfVgy2ZT0dNDo2LNzIoWPIHgfRZ7RwaNz68oYwSo9lNp1GM" crossorigin="anonymous"></script>
</body>
</html>
