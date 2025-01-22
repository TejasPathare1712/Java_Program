<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Student</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="container mt-5">
        <div class="card shadow">
            <div class="card-header bg-primary text-white">
                <h4>Edit Student</h4>
            </div>
            <div class="card-body">
                <%
                    int roll = Integer.parseInt(request.getParameter("roll"));
                    String name = "";
                    int marks = 0;

                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
                        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM student WHERE roll = ?");
                        pstmt.setInt(1, roll);
                        ResultSet rs = pstmt.executeQuery();

                        if (rs.next()) {
                            name = rs.getString("name");
                            marks = rs.getInt("marks");
                        }
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %>
                <form action="update.jsp" method="post">
                    <div class="mb-3">
                        <label for="roll" class="form-label">Roll No</label>
                        <input type="number" class="form-control" id="roll" name="roll" value="<%= roll %>" readonly>
                    </div>
                    <div class="mb-3">
                        <label for="name" class="form-label">Name</label>
                        <input type="text" class="form-control" id="name" name="name" value="<%= name %>" required>
                    </div>
                    <div class="mb-3">
                        <label for="marks" class="form-label">Marks</label>
                        <input type="number" class="form-control" id="marks" name="marks" value="<%= marks %>" min="0" max="100" required>
                    </div>
                    <button type="submit" class="btn btn-success">Update</button>
                    <a href="index.jsp" class="btn btn-secondary">Cancel</a>
                </form>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-7xkUuoXiWycE0XI7ZcfVgy2ZT0dNDo2LNzIoWPIHgfRZ7RwaNz68oYwSo9lNp1GM" crossorigin="anonymous"></script>
</body>
</html>
