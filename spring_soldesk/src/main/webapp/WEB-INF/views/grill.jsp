<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>${s_name }</th>
			<th>${s_category }</th>
			<th>${s_location }</th>
		</tr>
		<c:forEach var="s" items="${list }">
		<tr>
			<th>${s.s_name }</th>
			<th>${s.s_category }</th>
			<th>${s.s_location }</th>
		</tr>
		</c:forEach>
	</table>
</body>
</html>