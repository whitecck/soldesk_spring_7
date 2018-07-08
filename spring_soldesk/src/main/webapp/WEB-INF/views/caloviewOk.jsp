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
	<h2>caloviewOk.jsp</h2>
<%-- 	<h2>${i.s_id }</h2>
	<h2>이름 : ${i.s_name }</h2> --%>
	<h2>영업중 </h2>
	<form action="buy">
	<c:forEach var="list" items="${i }">
		<table>
			<tr>
				<th colspan="2">상품 사진 : ${list.i_image }</th>
			</tr>
			<tr>
				<th>가격 : ${list.i_price }</th>
				<td>이름 : ${list.i_name}</td>
			</tr>
		</table>
	</c:forEach>
		<input type="submit" value="주문하기" />
	</form>
	
</body>
</html>