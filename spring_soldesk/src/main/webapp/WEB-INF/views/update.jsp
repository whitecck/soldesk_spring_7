<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").on('click',function(){
			var loginid = $("#c_loginid").val();
			var id = $("#c_id").val();
			console.log(loginid);
			console.log(id);
		});
		$("#update").on('click',function(){
			
			document.frm.action="updateOk";
			document.frm.method="GET";
			document.frm.submit();
			console.log(loginid);
		});
	});
</script>
</head>
<body>
	<h2>update.jsp</h2>
	<form action="/updateOk" id="frm" name="frm">
	<table>
		<tr>
			<th>회원번호</th>
			<td><input type="text" name="c_id" id="c_id" placeholder="${list.c_id }를 입력해주세요"/></td>
		</tr>
		<tr>
			<th>비번</th>
			<td><input type="text" name="c_pw" id="c_pw" /></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name="c_name" id="c_name" /></td>
		</tr>
		<tr>
			<th>번호</th>
			<td><input type="text" name="c_phone" id="c_phone" /></td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><input type="text" name="c_email" id="c_email" /></td>
		</tr>
		<tr>
			<th colspan="2">
				<input type="button" value="수정" id="update" name="update"/>
				<input type="button" value="asd" name="btn" id="btn"/>
			</th>
		</tr>
	</table>
	</form>
</body>
</html>