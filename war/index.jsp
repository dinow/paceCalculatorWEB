<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.google.appengine.api.users.*" %>
<html>
<head>
<title>paceCalculatorWEB</title>
<%
	UserService userService = UserServiceFactory.getUserService();
	if (userService.getCurrentUser() != null) {
		%>
		<meta http-equiv="refresh" content="0; URL=/calcul.do">
		<%
	}else{
		%>
		<meta http-equiv="refresh" content="0; URL=<%=userService.createLoginURL("/")%>">
		<%	
	}
		%>
	
</head>
<body>
	
</body>
</html>