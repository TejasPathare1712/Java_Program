<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		PreparedStatement pstmt = con.prepareStatement("Insert into student values(?,?,?)");
		int r = Integer.parseInt(request.getParameter("txtroll"));
		String n = request.getParameter("txtname");
		int m = Integer.parseInt(request.getParameter("txtmarks"));
		pstmt.setInt(1,r);
		pstmt.setString(2, n);
		pstmt.setInt(3, m);
		pstmt.executeUpdate();
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	%>

</body>
</html>