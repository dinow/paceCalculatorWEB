<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="cResult" value="${calculResult }"/>
<html>
	<head>
	<script>
		function clearContent(id){
			document.getElementById(id).value = "";
		}
	</script>
		
	</head>
	<body>
		<form action="/calcul.do" method="post">
		<table>
			<tr>
				<td><input type="button" value="Clear" onclick="clearContent('kms')"></td><td>Kms</td><td><input type="text" id="kms" name="kms" value="${cResult.kms }"></td>
			</tr>
			<tr>
				<td><input type="button" value="Clear" onclick="clearContent('temps')"></td><td>Temps</td><td><input type="text" id="temps" name="temps" value="${cResult.temps }"></td>
			</tr>
			<tr>
				<td><input type="button" value="Clear" onclick="clearContent('allure')"></td><td>Allure</td><td><input type="text" id="allure" name="allure" value="${cResult.allure }"></td>
			</tr>
			<tr>
				<td><input type="button" value="Clear" onclick="clearContent('vitesse')"></td><td>Vitesse</td><td><input type="text" id="vitesse" name="vitesse" value="${cResult.vitesse }"></td>
			</tr>
			<tr>
				<td><input type="button" value="Clear" onclick="clearContent('pourcVMA')"></td><td>% VMA</td><td><input type="text" id="pourcVMA" name="pourcVMA" value="${cResult.pourcVMA }"></td>
			</tr>
			<tr>
				<td><input type="button" value="Clear" onclick="clearContent('vma')"></td><td>vma</td><td><input type="text" id="vma" name="vma" value="${cResult.vma }"></td>
			</tr>
			<tr>
				<td>&nbsp;</td><td colspan="2"><input type="submit" value="Calcul"/></td>
			</tr>
			<tr>
				<td colspan="3">${cResult.message}</td>
			</tr>
		</table>
		</form>
		
	
	</body>

</html>