<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>

<style type="text/css">
	
/*-------tablet-------*/
#div1{width:20%; height: 200px; float: left;}
#div2{width: 70%; height: 100px; }
#div3{width: 70%; height: 100px; }
#div4{margin-left: 20%; width: 100%;}
#div5{margin-left: 60%; margin-top:5%; height: 30px;}
#div6{width: 100%;}
#wrap{width: 100%;text-align: center;}
input {width: 70%; height : 25px; }
.input_div {margin-bottom: 20px;}
#zero {width : 10%; text-align: center;}
#phone{width : 59%;}.
#pw_re{margin-top: 5px;}
#regdiv input {width: 70%; height: 35px; color: white; font-size: 16px;
				border: none; background-color: #ff2424; margin: 10px;
				font-weight: bold;}
#div5{margin-left: 30%; margin-top:5%; height: 30px;}
/*----------mobaile----------*/
@media(max-width : 480px){
	#div1{width: 40%;}
	#lgimg{ margin-top: 20px; padding: 30px;}
	input {width: 90%; height : 25px; margin: 10px;}
	.input_div div {font-size: 12px;padding-left: 5%; margin-left: 5%;}
	.input_div {margin-bottom: 20px;}
	#zero {width : 14%;}
	#phone{width : 67%;}
	#regdiv input {width : 90%;}
#div5{width:100%; margin-left: 90%; margin-top:15%; height: 30px;}
}

	
</style>
</head>
<body>
	<div id="div6">전국 > 그릴류</div>
	<hr />
	
	
	<!--데이터 넣을곳  -->
	<div class="input_div">
	<div id="div1">
		<img src="" alt="" />
	</div>
	
	<div id="div2">가게 이름</div>
	<div id="div3">가게 내용
		<div id="div5">영업중</div>
	</div>
		
	</div>
	<hr />
	<!-- 데이터 넣을곳 end -->
	
	

</body>
</html>