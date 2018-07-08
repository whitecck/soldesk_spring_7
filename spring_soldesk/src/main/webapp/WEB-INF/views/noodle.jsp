<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<style type="text/css">
@charset "UTF-8";

#container {
	width: 100%;
	height: 1080px;
	float: left;
}

#header {
	width: 100%;
	height: 110px;
	background-color: red;
	position: relative;
	margin: 0px 0px 40px 0px;
}

#head_one {
	width: 350px;
	height: 110px;
	display: inline;
	margin: 0px;
}

#head_two {
	width: 150px;
	height: 70px;
}

#head_one {
	height: 110px;
}

#head_two {
	float: right;
	padding: 20px;
}

#head_one span {
	position: relative;
	bottom: 30px;
	right: 25px;
	font-size: 32px;
}

#head_two span {
	font-size: 26px;
}

#head_two img {
	width: 50px;
	height: 50px;
	position: relative;
	right: 15px;
	top: 10px;
}

#mainmenu {
	font-size: 28px;
	width: 100%;
	border-bottom: 1px solid black;
}

#infomation {
	width: 100%;
	height: 160px;
	/* background-color: red; */
	margin: 0px auto;
	float: left;
	border-bottom: 1px solid black;
}

#info_img {
	width: 130px;
	height: 160px;
	display: inline-block;
	/* background-color: blue; */
	margin: 0px;
}

#info_img img {
	width: 100px;
	height: 100px;
	border-radius: 50%;
	margin: 30px 15px;
}

#info_detail {
	width: 700px;
	height: 160px;
	display: inline-block;
	/* background-color: yellow; */
	margin: 0px;
}

#info_detail span {
	font-size: 30px;
}

#info_status {
	width: 100px;
	height: 160px;
	display: inline-block;
}

#bar {
	border: 4px solid orange;
	padding: 5px;
	background: orange;
	position: relative;
	color: white;
	right: px;
	bottom: 20px;
}

/*----------mobaile----------*/
@media ( max-width : 480px) {
	html {
		width: 100%;
	}
	#container {
		width: 100%;
	}
	#header {
		width: 100%;
	}
	#mainmenu {
		width: 100%;
	}
	#infomation {
		width: 100%;
		background-color: yellow;
	}
	#info_img {
		width: 100px;
		height: 160px;
		display: inline-block;
		margin: 0px;
	}
	#info_img img {
		width: 60px;
		height: 60px;
		border-radius: 50%;
		margin: 50px 15px;
	}
	#info_detail {
		width: 200px;
		height: 160px;
		display: inline-block;
		/* background-color: yellow; */
		margin: 0px;
	}
	#info_detail span {
		font-size: 18px;
	}
	#info_status {
		width: 70px;
		height: 70px;
		display: inline-block;
		margin: 0px 20px;
	}
}
</style>
<title>Insert title here</title>
</head>
<body>
	
	<div id="container">
		<p id="mainmenu">면/밥</p>
		<c:forEach var="list" items="${list }">
			<div id="infomation">
				<div id="info_img">
					<img src="" alt="가게그림" />
				</div>
				<div id="info_detail">
					<span>${list.s_name }</span> <br /> <span>${list.s_location }</span>
					<br /> <br /> <br /> <br /> <br />
				</div>
				<div id="info_status">
					<b id="bar">영업중</b>
				</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>