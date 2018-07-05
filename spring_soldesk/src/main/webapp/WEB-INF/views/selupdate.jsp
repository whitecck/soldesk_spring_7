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
		$("#c_iid").hide();
		$("#btn").on('click',function(){
			var loginid = $("#s_loginid").val();
			console.log(loginid);
		});
		$("#update").on('click',function(){
			var id = $("#s_id").val();
			var iid = $("#s_iid").val();
			console.log(id);
			
			if(id == iid){
				alert("회원정보가 수정되엇쓰빈다");
				
			document.frm.action="selupdateOk";
			document.frm.method="GET";
			document.frm.submit();
			console.log(loginid);
				
			}else {
				alert("회원번호를 똑바로 입력해주세여");
				$("#s_id").focus();
				return
			}
			
		});
		$("#s_iid").hide();
	});
</script>
</head>
<body>
<h2>selupdate.jsp</h2>
	<form action="/selupdateOk" id="frm" name="frm">
	<input type="text" name="s_iid" id="s_iid" value="${sellist.s_id }" />
	<table>
		<tr>
			<th>회원번호</th>
			<td><input type="text" name="s_id" id="s_id" placeholder="${sellist.s_id }를 입력해주세요"/></td>
		</tr>
		<tr>
			<th>비번</th>
			<td><input type="text" name="s_pw" id="s_pw" /></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name="s_name" id="s_name" /></td>
		</tr>
		<tr>
			<th>번호</th>
			<td><input type="text" name="s_phone" id="s_phone" /></td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><input type="text" name="s_email" id="s_email" /></td>
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