<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="be.dno.running.web.CalculationResult" %>

<c:set var="cResult" value="${calculResult }"/>
<html>
	<body>
		<form action="/calcul.do" method="post">
		<table>
			<tr>
				<td>Kms</td><td>${cResult.kms }</td>
			</tr>
			<tr>
				<td>Kms</td><td>${cResult.kms }</td>
			</tr>
			<tr>
				<td>Kms</td><td>${cResult.kms }</td>
			</tr>
			<tr>
				<td>Kms</td><td>${cResult.kms }</td>
			</tr>
			<tr>
				<td>Kms</td><td>${cResult.kms }</td>
			</tr>
			<tr>
				<td>Kms</td><td>${cResult.kms }</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Calcul"/></td>
			</tr>
		</table>
		</form>
		
	
	</body>

</html>