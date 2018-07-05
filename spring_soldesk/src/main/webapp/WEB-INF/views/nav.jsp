<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style type="text/css">
/*설정초기화*/
  *{margin:0px; padding:0px;}
   ul,li { list-style:none;}
   a { text-decoration:none;}
	img{height: 90px;  margin-top: 10px; margin-left: 10%;}
	#lg{font-family: "Bauhaus 93"; color: white; font-size: 40px;}

/*상단영역 시작*/
.header {width: 100% ;height: 100px; background-color: #FF2424;}
.header-bar{width: 100%; height:100px;background-color:#FF2424; }
#logo{width: 40%; float: left;}

/*로그인,회원가입*/
.header-bar .nav {float:right; margin-top:33px;width: 30%; }
.header-bar .nav li a { text-decoration: none; color: #ffffff; font-size: 18px; font-family: "HY견고딕";}
.header-bar .nav li{float:left; margin-left:10px; list-style: none; }
/*상단영역 끝*/
ul { margin-right: 10%;}

/*----------mobaile----------*/
@media(max-width : 480px){
	.header{width : 100%;height : 70px; background-color: black;}
	.header-bar{width: 100%; height:70px; }
	img { height: 60px; margin-top: 5px;  }
	#lg{display: none;}
	.header-bar .nav li a{font-size: 12px;}
	.header-bar .nav { margin-top:14px;width: 30%; }	
}
</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#loginid").hide();
		$("#logout").hide();
		var sessionid = $("#loginid").val();
		if(sessionid==""){
			$("#id").hide();
			$("#logout").hide();
			$("#lo").show();
		}else{
			$("#id").show();
			$("#logout").show();
			$("#lo").hide();
		}
		
		$("#logout").on('click',function(){
			$("#id").hide();
			$("#logout").hide();
			$("#lo").show();
			
		});
	});
</script>

</head>
<body>
<input type="text" name="loginid" id="loginid" value="${list.c_loginid }" />
<!--상단-->
    <div class ="header">
        <div class ="header-bar">
          	
          	<div id="logo">
            	<img src="https://cdn3.iconfinder.com/data/icons/restaurant-40/50/Food_delivery-512.png" alt="로고 부분" >
          		<span id="lg">FoodPass</span>
          	</div>

            <div class ="nav">
            <ul>
                <li id="lo" name="lo"><a href="login">로그인</a></li>
                <span id="id" name="id"><li>${list.c_loginid }</li></span>
                <li id="logout" name="logout"><a href="logout">로그아웃</a></li>

            </ul>
            </div>

         </div>
    </div>
</body>
</html>