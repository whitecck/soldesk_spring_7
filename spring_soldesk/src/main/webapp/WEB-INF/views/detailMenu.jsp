<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- SUNMIN -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%
//현재시간 받아와서 한시간 후부터 셀렉트 옵션 뜨게 해주기
	String date = new Date().toString();
	int d = Integer.parseInt(date.substring(11, 13));	
%>

<style type="text/css">
/*-------tablet-------*/
#wrap{width: 100%;text-align: center;}
img{width: 30%;}

/*----------mobaile----------*/
@media(max-width : 480px){
#wrap{width : 100%;}
img{width: 40%;}
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	window.onload = function () {
		var coust = $("#money").text();
		$(document).ready(function() { $("#charge").html(coust * 1); });
	}

	function calcharge() {
		//var coust = document.getElementById("money");
		var coust = $("#money").text();
		
		var count = document.getElementById("cnt").value;
		console.log(coust * count);
		
		$("#charge").html(coust * count);
	}
	
	function gotores() {
		
	}

</script>
<title>푸드패스 : 메뉴</title>
</head>
<body>

<div id="wrap">
	<div id="menuinfo">
		<div id="menuimg">
			<img src="http://img.gqkorea.co.kr/gq/2017/11/style_5a0aa316842aa.png" alt="메뉴 이미지" />
		</div>
		<div id="jumpo">
			<h3>가게이르음</h3>
			<h4>메뉴 이르음</h4>
			<h4><span id="money">9000</span>원</h4>
		</div>
		<div id="addr"><p>주소를 받아오는 영역입니다아아아ㅏㅏㅏㅏ</p></div>
	</div>
	<div id="order">
		<div id="sel">
			<select name="cnt" id="cnt" onchange="calcharge()">
				<option value="1">1 개</option>
				<option value="2">2 개</option>
				<option value="3">3 개</option>
				<option value="4">4 개</option>
				<option value="5">5 개</option>
			</select>
			<span id="charge"></span><span>원</span>
		</div>
		<div id="take">
			<p>수령시간은 현재시간 1시간 후부터 가능합니다.</p>
			<h3>수령시간</h3>
 			<select id="o_hour">
 			<%if(d > 12 && d < 24){
 				d +=1;
 				
 				for(int i =d ; i <24 ; i++){
 				%>
				<option value="<%=i%>"><%=i %></option>
 				<%
 				}//for end
 			}else {
 				for(int i =12 ; i <24 ; i++){
 					%>
 					<option value="<%=i%>"><%=i %></option>
 	 				<%
 				}//for end
 			}//else end
 			
 			%>		
			</select>
			<select id="o_min">
				<option value="00">00</option>
				<option value="15">15</option>
				<option value="30">30</option>
				<option value="45">45</option>
			</select>
			
			<p>푸드패스의 예약은 결제와 동시에 이루어집니다</p>
			<input type="button" value="예약하기" onclick="gotores()"/>
		</div>	
	
	</div>
	

</div>

</body>
</html>