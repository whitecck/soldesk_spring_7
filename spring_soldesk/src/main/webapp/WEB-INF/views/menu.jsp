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
	<h2>menu.jsp</h2>
	<h2>${idto.s_id }</h2>
	<h2>${sdto.s_name }</h2>
	<h2>${sdto.s_open }</h2>
	
	<c:forEach var="i" items="${idto }">
		<table>
			<tr>
				<th colspan="2">${i.i_image }</th>
			</tr>
			<tr>
				<th>${i.i_price }</th>
				<td>${i.i_name}</td>
			</tr>
		</table>
	</c:forEach>
</body>
</html>