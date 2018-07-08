<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <!-- sunmin -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style type="text/css">
/*-------tablet-------*/
.wrap{width: 100%;text-align: center;}
#lgimg{ margin-top: 180px; padding: 30px;}
#input_id input{width: 70% ; height: 25px; margin: 10px;}
#input_pw input{width: 70% ; height: 25px; margin: 10px;}
#login_btn input{ width: 70%; height: 35px; color: white; font-size: 16px;
				border: none; background-color: #ff2424; margin: 10px;}
.info { text-decoration: none; color: grey;	}
#minfo{margin: 20px;}


/*----------mobaile----------*/
@media(max-width : 480px){
	#lgimg{ margin-top: 100px; padding: 30px;}
	#input_id input{width: 90% ; height: 25px; margin: 10px; }
	#input_pw input{width: 90% ; height: 25px; margin: 10px;}
	#login_btn input{ width: 90%; height: 35px; color: white; font-size: 16px;
				border: none; background-color: yellowgreen; margin: 10px;}
	a{font-size: 10px;}
	#input_radio { font-size: 14px;}
}

</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").on('click',function(){
			var userid = $("#id").val();
			var userpw = $("#pw").val();
			if(userid==""){
				alert("아이디를 입력해주세요");
				$("#id").focus();
				return;
			}
			if(userpw==""){
				alert("비밀번호를 입력하세요");
				$("pw").focus();
				return
			}
			
			console.log(userid +  " : " +userpw);
			
			document.frm.action="loginOk";
			document.frm.method="POST";
			document.frm.submit();
		});
		$("#btnid").on('click',function(){
			var type = $("#type").val();
			
			document.frm.action="findid"
			document.frm.submit();
		});

	});
</script>

<title>푸드패스:로그인</title>
</head>
<body>
<div class="wrap">
	<!-- header -->
	<div id="header">
		<!-- 로고 이미지 넣어야함 ㅇㅅㅇ -->
		<div id="lgimg"><img src="resources/img/logo.jpg" alt="로고이미지" /></div>
	</div>
	<!-- container -->
	<div id="container">
		<!-- input: login part -->
		<div id="content">
			<form action="/loginOk" id="frm" name="frm">
			
			<div id="input">
				<div id="input_radio">
					<input type="radio" name="type" id="a" value="a" checked> 손님
  					<input type="radio" name="type" id="b" value="b"> 사장님
				</div>
				<div id="input_id">
					<input type="text" name="id" id="id" placeholder="  아이디"/></div>
				<div id="input_pw">
					<input type="password" name="pw" id="pw" placeholder="  비밀번호"/></div>
					
				<div id="login_btn">
					<input type="button" value="로그인"  id="btn"/>
				</div>
			</div>
			<!-- login inform find -->
			<div id="minfo">
				<a href="findcusid" class="info" id="btnid">아이디찾기</a>
				<span class="bar">|</span>
				<a href="customerfindpw" class="info" id="btnpw">비밀번호찾기</a>
				<span class="bar">|</span>
				<a href="insertAll" class="info" id="insert">회원가입</a>
			</form>	
			</div>
		</div>
	</div>
</div>
</body>
</html>