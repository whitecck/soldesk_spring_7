<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- project2 file -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style type="text/css">
#wrap{width: 100%; text-align: center;}
#write_div { border: 1px solid black;width: 100%;height: auto;}
#frm_wrap{ width: 80%; height: auto; margin: 5px auto;}
#title_div { width: 500px;height: auto; margin: 20px auto;  }
#title_div input{width: 310px;	height: 30px;border: none;border-bottom: 3px solid gray;
		font-size: 15px;outline: none;   }
#imgInp{opacity:0;position:relative;width: 130px;height: 40px;cursor: pointer;  }
#file_btn{ position: absolute;  width: 130px;  height: 40px;  font-weight: bold;
	  border: 3px solid gray;  font-size: 15px;  background: white;  color: black;
	  cursor: pointer;	}
#file_div{	width: 140px;  	 height: auto; 	 margin: 20px auto;}
#upload_img {display : none;width: 100%;margin: 0;}
#img_div{width: 40%;margin: 20px auto; border-radius: 50%; overflow: hidden;}
#submit_div {	width:140px;	height: 40px;	margin: 30px auto;	}
#submit_div input{	opacity:0;position:relative;width: 130px;height: 40px; cursor: pointer;}	
#submit_div button{	width: 130px;  height: 40px;  font-weight: bold; border: 3px solid gray;
	  font-size: 15px;  background: gray;  color: white;  cursor: pointer;	}
</style>
<title></title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript">
    	
        $(function() {
            $("#imgInp").on('change', function(){
                readURL(this);
            });
            
           
        });
        function readURL(input) {
            if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                    $('#upload_img').attr('src', e.target.result);
                    $('#upload_img').css('display', 'inline');
                    
                }
              reader.readAsDataURL(input.files[0]);
            }
        }
        
        function subcheck() {
				//document.frm.action = "illwriteOk.jsp";
				document.frm.submit();
			
		}
       
    </script>
</head>
<body>
	<div id="wrap">
	<div id="info">
		<h3>>프로필 수정</h3>
	</div>
	<div id="write_div">
    <form id="frm" action="#" method="post" name="frm" enctype="multipart/form-data">
    	<div id="frm_wrap">
    	
    		<div id="file_div">
        		<button id="file_btn">이미지 업로드</button><input type='file' name="upload" id="imgInp"/>
			</div>
        	<div id="img_div">
        		<img id="upload_img" src="#" alt="이미지" /></div>
    		<div id="tit">
    			<h4>트럭명</h4>
    			<input type="text" name="name" id="name" placeholder="점포값 받아오기"/>
    		</div>
    		<div id="cont">
    			<h4>트럭설명</h4>
        		<textarea name="content" id="content" cols="30" rows="10" placeholder="트럭설명을 입력해주세요!"></textarea>
    		</div>
    	
        <div id="submit_div">
      	  	 <button value="업로드" id="subbtn" onclick="subcheck()">업로드</button>
        </div>
    	</div>        
    </form>
    </div>
	</div>
</body>
</html>