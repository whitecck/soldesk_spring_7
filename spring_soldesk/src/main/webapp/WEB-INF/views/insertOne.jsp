<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>insertOne.jsp</h2>
	<h2>회원 가입 입력창 </h2>
	<form action="insertOk">
	<table>
		<tr>
			<th>이름</th>
			<td><input type="text" name="c_name" id="c_name" /></td>
		</tr>
		<tr>
			<th>번호</th>
			<td><input type="text" name="c_phone" id="c_phone" /></td>
		</tr>
		<tr>
			<th>아이디</th>
			<td><input type="text" name="c_loginid" id="c_loginid" /></td>
		</tr>
		<tr>
			<th>비번</th>
			<td><input type="text" name="c_pw" id="c_pw" /></td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><input type="text" name="c_email" id="c_email" /></td>
		</tr>
		<tr>
			<th colspan="2">
				<input type="submit" value="가입" />
			</th>
		</tr>
	</table>
	</form>
</body>
</html>