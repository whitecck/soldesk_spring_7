<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- SUN 유저 회원가입창-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>푸드패스 :회원가입</title>
<style type="text/css">
/*-------tablet-------*/
#wrap{width: 100%;text-align: center;}
#lgimg{ margin-top: 50px; padding: 30px;}
input {width: 70%; height : 25px; }
.input_div div{font-size: 14px; text-align: left; padding-left: 15%; }
.input_div {margin-bottom: 30px;}
#zero {width : 10%; text-align: center;}
#phone{width : 59%;}
#pw_re{margin-top: 5px;}
#regdiv input {width: 70%; height: 35px; color: white; font-size: 16px;
				border: none; background-color: #ff2424; margin: 10px;
				font-weight: bold;}
/*----------mobaile----------*/
@media(max-width : 480px){
	#lgimg{ margin-top: 20px; padding: 30px;}
	input {width: 90%; height : 25px; margin: 10px;}
	.input_div div {font-size: 12px;padding-left: 5%;}
	.input_div {margin-bottom: 20px;}
	#zero {width : 14%;}
	#phone{width : 67%;}
	#regdiv input {width : 90%;}
}
</style>


<!-- javascript -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
 
//     아이디와 비밀번호가 맞지 않을 경우 가입버튼 비활성화를 위한 변수설정
    var idCheck = 0;
    var pwdCheck = 0;
    //아이디 체크하여 가입버튼 비활성화, 중복확인.(수정해야함)
    /*
    function checkId() {
        var inputed = $('.id').val();
        $.ajax({
            data : {
                id : inputed
            },
            url : "checkId.jy",
            success : function(data) {
                if(inputed=="" && data=='0') {
                    $(".signupbtn").prop("disabled", true);
                    $(".signupbtn").css("background-color", "#aaaaaa");
                    $("#checkaa").css("background-color", "#FFCECE");
                    idCheck = 0;
                } else if (data == '0') {
                    $("#checkaa").css("background-color", "#B0F6AC");
                    idCheck = 1;
                    if(idCheck==1 && pwdCheck == 1) {
                        $(".signupbtn").prop("disabled", false);
                        $(".signupbtn").css("background-color", "#4CAF50");
                        signupCheck();
                    } 
                } else if (data == '1') {
                    $(".signupbtn").prop("disabled", true);
                    $(".signupbtn").css("background-color", "#aaaaaa");
                    $("#checkaa").css("background-color", "#FFCECE");
                    idCheck = 0;
                } 
            }
        });
    }
    */
    
  //재입력 비밀번호 체크하여 가입버튼 비활성화 또는 맞지않음을 알림.
    function checkPwd() {
        var inputed = $('#pw').val();
        var reinputed = $('#pw_re').val();
        if(reinputed=="" && (inputed != reinputed || inputed == reinputed)){
			$('#checkpw').css("color","black");
        }
        else if (inputed == reinputed) {
        	//console.log("elseif 첫번째");
			$("#checkpw").css("color", "green");
        	pwdCheck = 1;
            if(idCheck==1 && pwdCheck == 1) {
                console.log("else if 이너 if");
            }
        } else if (inputed != reinputed) {
            pwdCheck = 0;
			$("#checkpw").css("color", "red");
        }
    }
</script>
</head>
<body>
<!-- wrap -->
<div id="wrap">
	<!-- header -->
	<div id="header">
		<!-- 로고 이미지 넣어야함 ㅇㅅㅇ -->
		<div id="lgimg"><img src="resources/img/logo.jpg" alt="로고이미지" /></div>
		<div><h3><strong>"손님" </strong> 회원가입</h3></div>
		
	</div>
	<!-- content -->
	<div id="content_wrap">
		<form action="#">
		<!-- id입력란  -->
		<div class="input_div">
			<input type="text" name="id" id="id" placeholder=" 아이디" required oninput="checkId()"/>
			<div>6자 이상 영어 대 소문자, 숫자</div>
			<div id="checkid" >실시간 아이디 유효성검사</div>
		</div>
		<!-- 비밀번호 입력란 -->
		<div class="input_div">
			<input type="password" name="pw" id="pw" placeholder=" 비밀번호" required/>
			<div> 영어 대 소문자, 숫자, 특수문자 사용가능</div>
			<input type="password" name="pw_re" id="pw_re" placeholder=" 비밀번호 확인" required oninput="checkPwd()"/>
			<div id="checkpw">패스워드 일치 하는지 ㅇㅅㅇ</div>
		</div>
		<!-- 이름 입력부분 -->
		<div class="input_div">
			<input type="text" name="name" id="name" placeholder=" 이름" required/>		
		</div>
		<div class="input_div">
			<input type="text" name="010" id="zero" value="010" disabled="disabled" required />
			<input type="text" name="phone" id="phone" placeholder=" 8자리  - 없이 입력" required />
		</div>
		<!-- 이메일 입력부분 -->
		<div class="input_div">
			<input type="email" name="email" id="email" placeholder=" 이메일" />
		</div>
		<div id="regdiv">
			<input type="submit" value="회원가입" required/>
		</div>
		</form>
	</div>
	
	
</div>
</body>
</html>