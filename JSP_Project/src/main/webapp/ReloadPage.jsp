<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ReloadPage</title>
</head>
<body>
	<%!int ctr=0; %>
	<%!
		int count()
		{
		return (++ctr);
		}
	%>
	<h3><%=count() %></h3>
</body>
</html>