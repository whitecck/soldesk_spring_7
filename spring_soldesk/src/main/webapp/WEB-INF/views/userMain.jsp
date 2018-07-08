<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>푸드패스 :메인</title>
<style type="text/css">
@font-face{
	font-family: "빙그레체";
	src: url(../font/Binggrae-Bold.ttf) format('truetype');
}

/*설정초기화*/
  *{margin:0px; padding:0px;}
   ul,li { list-style:none;}
   a { text-decoration:none;}
   img { vertical-align:top; border:none;} 


/*중단영역 시작*/
.container {margin: 0 auto; width: 100%;}

/*배경*/
.container #bg {width:100%; height: 850px; background-image: url(./resources/img/bg.jpg);
background-repeat:no-repeat; min-height: 100%;  background-size: cover;
}

/*배경 글씨*/
.container #bg h1 {font-size: 110px; text-align: center; color: #FF2424; font-family: '빙그레체';
	padding-top: 70px; font-family: 빙그레체 ,serif;
}


/*sel 컨테이너*/
.container #bg .sel {width: 990px; height: 100%; margin: 0 auto; text-align: center;
	padding-top: 200px;}

/*검색바*/
.sel1 {width: 150px; height: 80px; font-size: 30px; border: 1px solid black;
		border-radius: 5px;  -webkit-appearance: none; -moz-appearance: none;
		appearance: none; background-image: url(../img/under_icon.png);
		background-repeat: no-repeat; background-position: right;
		background-size: 20px 20px;
		
		

}

.sel1 ::-ms-expand { display: none; } /*IE에 아이콘 제거*/

.sel2 {width: 400px; height: 80px; font-size: 30px; border: 1px solid black;
		border-radius: 5px;  -webkit-appearance: none; -moz-appearance: none;
		appearance: none; background-image: url(../img/under_icon.png);
		background-repeat: no-repeat; background-position: right;
		background-size: 20px 20px;}

td a img{width: 150px;}

/*메뉴 테이블 */
table {width: 100%; height: 330px;  border-collapse: collapse;}
td {width: 33%; border:1px solid #000; text-align: center; padding-bottom: 10px;}
table h2{padding-bottom: 10px; }

/*중단영역 끝*/

/*하단영역 시작*/
.footer {width:100%;background-color:#272727; }
.footer h4 {color: #A5A5A5; padding-top: 20px; padding-left: 15px;}
.footer p {color: #A5A5A5; padding-bottom: 10px; padding-left: 15px;}




@media(max-width : 480px){
	/*배경*/
	.container #bg{width :100%;}
	.container #bg h1 { font-size: 36px;}
	.container #bg {  width: 100%;   background-size: 100%;   height: fit-content;}
	.container #bg .sel {width: 100%; padding-top: 80px;margin-bottom: 50px;}
	.sel1{width: 100px; height: 30px; font-size: 17px;}
	.sel2{width: 100px; height: 30px; font-size: 17px;}
}
</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#mapdetail").on('click',function(){
			
			var map = $("#map").val();
			var mapdetail = $("#mapdetail").val();
			console.log(map + " : " + mapdetail);
		});
		$(".category").hide();
		$("td").on('click',function(){
			
			document.frm.action="findgrill";
			document.frm.submit();
			
		});
	});
</script>
</head>
<body>
<!-- nav var 부분 -->
<jsp:include page="nav.jsp"></jsp:include>

<!-- 트럭 메인부분 -->
<form action="#" id="frm" name="frm">
    <div class="container">
    	<div id = "bg">
        <h1>언제까지 기다려?</h1>

       <div class = "sel">
       
       <!--
       	전국 1 
       	여의도 2
       	반포 3
       	동대문 4
       	청계천 5
       	강남 6 
        -->
       <select class="sel1" name="s_location" id="s_location">
            <option value="1"  selected>전국</option>
            <option value="2">여의도</option>
            <option value="3">반포</option>
            <option value="4">동대문</option>
            <option value="5">청계천</option>
            <option value="6">강남</option>
       </select> <!--sel1 end-->
       
   </div> <!--sel end-->
       </div>
    	
        <table>
                 <tr>
                     <td id = btn1 ><img src="resources/img/grill.png" alt="">
                     <h2>그릴<input type="text" class="category" name="s_category" id="s_category" value="grill"/></h2></td>
                     <td id = btn2><a href="noodle"><img src="resources/img/noodle.png" alt="">
                     <h2>면/밥</h2></a></td>
                     <td id = btn3><a href="stick"><img src="resources/img/stick.png" alt="">
                    <h2>꼬치</h2></a></td>
                 </tr>
             
                 <tr>
                     <td id = btn4><a href="fri"><img src="resources/img/fri.png" alt="">
                        <h2>튀김</h2></a></td>
                     <td id = btn5><a href="desert"><img src="resources/img/desert.png" alt="">
                        <h2>디저트</h2></a>
                     </td>
                     <td id = btn6><a href="guitar"><img src="resources/img/guitar.png" alt="">
                        <h2>기타</h2></a></td>
                 </tr>
             
             </table> 
            	
    </div>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>