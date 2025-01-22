<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%> 
<%@ page import="java.sql.*" %> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="ISO-8859-1"> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous"> 
<title>Student Records</title> 
<style>
    body {
        background-color: #f8f9fa;
    }
    .card {
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        transition: transform 0.2s;
    }
    .card:hover {
        transform: scale(1.05);
    }
</style>
</head> 
<body> 
<div class="container mt-4"> 
    <div class="text-center mb-4">
        <h1 class="text-primary">Student Records</h1>
        <p class="text-muted">Manage student details effectively</p>
    </div>
    <div class="row"> 
        <% 
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root"); 
                PreparedStatement pstmt = con.prepareStatement("select * from student"); 
                ResultSet rs = pstmt.executeQuery(); 
                int r, m; 
                String n; 
                while (rs.next()) { 
                    r = rs.getInt(1); 
                    n = rs.getString(2); 
                    m = rs.getInt(3); 
        %> 
        <div class="col-lg-4 col-md-6 col-sm-12 mt-3"> 
            <div class="card" style="width: 100%;"> 
                <div class="card-body"> 
                    <h5 class="card-title text-primary">Roll No: <%= r %></h5> 
                    <h6 class="card-subtitle mb-2 text-secondary">Name: <%= n %></h6> 
                    <p class="card-text">Marks: <%= m %></p> 
                    <a href="edit.jsp?roll=<%= r %>" class="btn btn-warning btn-sm me-2">Edit</a>  
                    <a href="delete.jsp?roll=<%= r %>" class="btn btn-danger btn-sm">Delete</a> 
                </div> 
            </div> 
        </div> 
        <%  
                } 
            } catch (Exception e) { 
                e.printStackTrace(); 
            } 
        %> 
    </div> 
</div> 

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-7xkUuoXiWycE0XI7ZcfVgy2ZT0dNDo2LNzIoWPIHgfRZ7RwaNz68oYwSo9lNp1GM" crossorigin="anonymous"></script>
</body> 
</html>
