<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<html>
<title>Login</title>
<body>

<springForm:form name="doLogin" action="doLogin" method="Get" commandName="userForm">
<table><tr><td>
<springForm:errors path="userName" cssClass="error"></springForm:errors></td><br></br></tr>
<tr><td>UserName:</td><td><springForm:input path="userName"></springForm:input></td></tr><br></br>

<tr><td><springForm:errors path="passWord" cssClass="error"></springForm:errors></td></tr><br></br>

<tr><td>Password:</td><td><springForm:input path="passWord"></springForm:input></td></tr>
<tr><td align="center"><input type="submit" name="submit" value="Login"></input></td></tr>
</table>
</springForm:form>
</body>
</html>