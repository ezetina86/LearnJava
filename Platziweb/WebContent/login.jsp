<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%-- Comentario JSP --%>
    <%! int i = 0;%>
	<form method="get" action="./abc123">
	<table>
		<tr>
		<td><label> User:</label></td>
		<td><input  type="text" name="user"></td>
		<td><label> Password:</label></td>
		<td><input  type="password" name="password"></td>
		<td><label> Company:</label></td>
		<td><input  type="text" name="company"></td>
	</tr>
	<tr>
			<td><input type="submit" value="Send"></td>
    </tr>
	</table>	
	<% 
	  for(i=0; i<20;i++){
    %>
	<label>Hola <%=i%></label>
	<% 
	  }
	%>
	</form>
</body>
</html>