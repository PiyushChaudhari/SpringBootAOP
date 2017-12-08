<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Addition</title>
</head>
<body>

	<h1 align="center">Addition</h1>

	<dir class="center">
		<form:form method="POST"
			action="${pageContext.request.contextPath}/home/result"
			commandName="addition">
			
			<form:label path="firstValue">First Value:</form:label>
			<form:input path="firstValue" value="${addition.firstValue}" />
			
			</br>
			
			<form:label path="secondValue">Second Value:</form:label>
			<form:input path="secondValue" value="${addition.secondValue}" />
			
			</br>
			
			<input type="submit" value="Result" />
		</form:form>
	</dir>
</body>
</html>