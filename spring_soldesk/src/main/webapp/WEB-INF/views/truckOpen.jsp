<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<style type="text/css">
/*-------tablet-------*/
.con{width: 100%;text-align: center;}
#wrap{display:none;border:1px solid;width:500px;height:300px;margin:5px auto;position:relative;}
#btnFoldWrap{cursor:pointer;position:absolute;right:0px;top:-1px;z-index:1}

/*----------mobaile----------*/
@media(max-width : 480px){
#wrap{width : 100%;}
}
</style>
<title>푸드패스 : 개점</title>
</head>
<body>
<!-- 전체 감싸는 컨테이너 -->
<div class="con">
	
	<div id="info">
		<div id="infotit">
			<h3>  > 개점 정보 : 고쳐봄 ㅇㅅㅇ</h3>
			
		</div>
		<div id="title"><h3>가게 이름</h3></div>		
		<div id="imgcon">
			<img src="" alt="트럭썸네일" />
		</div>
		<div id="optime">
			<span>개점시간</span>
			<select id="o_hour">
				<option value="12">12</option>
				<option value="13">13</option>
				<option value="14">14</option>
				<option value="15">15</option>				
				<option value="16">16</option>				
				<option value="17">17</option>				
				<option value="18">18</option>				
				<option value="19">19</option>				
				<option value="20">20</option>				
			</select>
			<select id="o_min">
				<option value="00">00</option>
				<option value="15">15</option>
				<option value="30">30</option>
				<option value="45">45</option>
			</select>
		</div>
		<div id="clstime">
			<span>폐점시간</span>
			<select id="c_hour">
				<option value="19">19</option>
				<option value="20">20</option>
				<option value="21">21</option>
				<option value="22">22</option>				
				<option value="23">23</option>				
				<option value="24">24</option>				
				<option value="01">새벽01</option>				
				<option value="02">새벽02</option>				
			</select>
			<select id="c_min">
				<option value="00">00</option>
				<option value="15">15</option>
				<option value="30">30</option>
				<option value="45">45</option>
			</select>
		</div>
		
	</div>
	<input type="button" onclick="execDaumPostcode()" value="주소찾기"><br>
<form action="#">
	
	<div id="wrap" >
	<img src="//t1.daumcdn.net/localimg/localimages/07/postcode/320/close.png" id="btnFoldWrap" onclick="foldDaumPostcode()" alt="접기 버튼">
	</div>
	<input type="text" id="address" class="d_form large" placeholder="주소" required">
	
	<input type="button" value="개점!!!" onclick = "dosubmit()" />
</form>
</div>
<script>
	//주소팝업 소스-------------------------
    var element_wrap = document.getElementById('wrap');

    function foldDaumPostcode() {
        // iframe을 넣은 element를 안보이게 한다.
        element_wrap.style.display = 'none';
    }
    function execDaumPostcode() {
        // 현재 scroll 위치를 저장해놓는다.
        var currentScroll = Math.max(document.body.scrollTop, document.documentElement.scrollTop);
        new daum.Postcode({
            oncomplete: function(data) {
                // 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                var fullAddr = data.address; // 최종 주소 변수
                var extraAddr = ''; // 조합형 주소 변수

                // 기본 주소가 도로명 타입일때 조합한다.
                if(data.addressType === 'R'){
                    //법정동명이 있을 경우 추가한다.
                    if(data.bname !== ''){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있을 경우 추가한다.
                    if(data.buildingName !== ''){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.
                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
                }

                // 주소 정보를 해당 필드에 넣는다.
                document.getElementById('address').value = fullAddr;

                // iframe을 넣은 element를 안보이게 한다.
                // (autoClose:false 기능을 이용한다면, 아래 코드를 제거해야 화면에서 사라지지 않는다.)
                element_wrap.style.display = 'none';

                // 우편번호 찾기 화면이 보이기 이전으로 scroll 위치를 되돌린다.
                document.body.scrollTop = currentScroll;
            },
            // 우편번호 찾기 화면 크기가 조정되었을때 실행할 코드를 작성하는 부분. iframe을 넣은 element의 높이값을 조정한다.
            onresize : function(size) {
                element_wrap.style.height = size.height+'px';
            },
            width : '100%',
            height : '100%'
        }).embed(element_wrap);

        // iframe을 넣은 element를 보이게 한다.
        element_wrap.style.display = 'block';
    }
    
//-----------------------------주소팝업 end
function dosubmit() {
	
	var address  = document.getElementById('address').value;
	var open = document.getElementById('o_hour').value +":" + document.getElementById('o_min').value;
	var cls = document.getElementById('c_hour').value +":"+ document.getElementById('c_min').value;
	//open시간 ~ 닫는시간 결정
	console.log("address" + address);
	console.log("open" + open);
	console.log("cls" + cls);
	
	var times = open + " - " +cls;
		
	console.log("times" + times);
		
	//정보 저장하는곳으로주소 옮겨줌..?
	//location.href="test.jsp?addr="+address+"&times="+times;
	
}
    
</script>
</body>
</html>