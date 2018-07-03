<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- SUN -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>푸드패스</title>
<style type="text/css">

/*-------tablet-------*/
.wrap{width: 100%;text-align: center;}
#flag{margin-top: 150px; margin-bottom: 50px;}
#mytruck{background-color: blue; width:30%; height:150px;display: inline-block; margin: 1%; }
#booking{background-color:pink; width : 30%; height : 150px; display: inline-block; margin: 1%;}
#refund{background-color: green; width : 63%; height: 150px; margin: 1% auto;}
input{width :100px; height: 70px; margin:  10px; border : none; color: white; font-size: 18px; font-weight: bold;}
#open{background-color: grey;}
#cls{background-color: #ff2424;}
.bl{text-align: center; }


/*----------mobaile----------*/
@media(max-width : 480px){
	.wrap{background-color: pink;}
}
</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	var flag =1;
	function btnclick(number) {
		var num = number;
		var open = document.getElementById("open");
		var cls = document.getElementById("cls");
		
		//영업중
		if(flag !=num && num ==0){
			if(confirm("영업상태로 변경합니다")){
				open.style.backgroundColor = "tomato";
				cls.style.backgroundColor = "gray";
				flag = 0;
				//truckOpen.jsp 으로 이어져야합니다!!
				//location.href=""
			}
		}
		//영업종료
		if(flag != num && num==1){
			if(confirm("영업을 종료합니다")){
				open.style.backgroundColor = "gray";
				cls.style.backgroundColor = "tomato";
				flag =1;
			}
		}

	}
</script>
</head>
<body>

<!-- nav 부착해야하는 부부우우우우운 -->


<div class="wrap">
	<div id="content">
		<div id="flag">
			<h3>오늘 영업상태는?</h3>
			<input type="button" value="영업중" class="close" onclick="btnclick(0)" id="open"/>
			<input type="button" value="쉬는중" class="close" onclick="btnclick(1)" id="cls"/>
		</div>
		<!-- 넘겨오는거 미완서어어엉 -->
		<div id="con" class="bl">
			<div id="mytruck" onclick="#">
				<img src="" alt="트럭이미지" />
				<h3>트럭관리</h3>
			</div>
			<div id="booking" onclick="#" class="bl">
				<img src="" alt="트럭이미지" />
				<h3>예약관리</h3>
			</div>
			<div id="refund" onclick="#" class="bl">
				<img src="" alt="트럭이미지" />
				<span><h3>환급</h3> </span>
			</div>
		</div>
	</div>
	
	
	<!-- footer -->
</div>

</body>
</html>