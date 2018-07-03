<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>
		<a href="update">${sellist.s_loginid}</a>님 환영합니다.
	</h2>
	<h2>session ${sessionScope.suerNumber }</h2>
	<h2>${s_id }</h2>
	<h2>id : ${sellist.s_id }</h2>
	<h2>pw : ${sellist.s_pw }</h2>
	<h2>na : ${sellist.s_name }</h2>
</body>
</html>