<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2><a href="update">${list.c_loginid}</a>님 환영합니다.</h2>
    <h2>session ${sessionScope.suerNumber } </h2>
    <h2>${c_id }</h2>
    <h2>id : ${list.c_id }</h2>
    <h2>${list.c_pw }</h2>
    <h2>${list.c_name }</h2>
</body>
</html>