<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<html>
<title>Login</title>
<body>

<springForm:form name="doRegister" action="doRegister" method="Get" commandName="personForm">
<table><tr><td>
<springForm:errors path="firstName" cssClass="error"></springForm:errors></td><br></br></tr>
<tr><td>First Name:</td><td><springForm:input path="firstName"></springForm:input></td></tr><br></br>
<tr><td><springForm:errors path="firstName" cssClass="error"></springForm:errors></td></tr><br></br>

<tr><td>Last Name:</td><td><springForm:input path="lastName"></springForm:input></td></tr>
<tr><td><springForm:errors path="lastName" cssClass="error"></springForm:errors></td></tr><br></br>

<tr><td align="center"><input type="submit" name="submit" value="Register"></input></td></tr>
</table>
</springForm:form>
</body>
</html>