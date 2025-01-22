<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date" %>
    <%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP Page</title>
</head>
<body>
	<%!int no =10; %> <!-- //Declaration Tag -->
	The given Number is
	<%=no %><!-- //Expression tag -->
	The Square of number 
	<%=no*no %>
	<br>
	<%
		
		Date d1 = new Date();
		out.println(d1.getDate());
		Calendar c1 = Calendar.getInstance();
		out.println(c1.getTime());
		
	%>
</body>
</html>