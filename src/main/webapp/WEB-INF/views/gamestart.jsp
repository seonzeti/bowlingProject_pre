<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>

<html>
<head>
<title>Bowling Score - Game</title>
<meta charset="utf-8" />

<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="./resources/assets/css/main.css"
	type="text/css" />






<style>
table.scoresheet {
	margin: 0 auto;
	width: 80%;
	font-size: 12px;
	border: 1px solid;
	text-align: center;
	table-layout: fixed;
	margin-bottom: 40px;
}

table.scoresheet th, tr, td {
	padding: 0;
	vertical-align: middle;
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
}

table.scoresheet th {
	border-bottom: 1px solid;
	background-color: #ffbfb7;
	height: 30px;
}

table.scoresheet th:not (:last-child ) {
	border-right: 1px solid;
}

table.scoresheet td {
	height: 30px;
	background: rgba(255, 255, 255, 0.5);
}

table.scoresheet tr td:not (:last-child ) {
	border-right: 1px solid;
}

table.scoresheet tr:nth-child(2) td:nth-child(even) {
	border-bottom: 1px solid;
}

table.scoresheet tr:nth-child(2) td:last-child {
	border-bottom: 1px solid;
}

.btn-secondary, .btn-warning {
	color: #fff
}

@font-face {
	font-family: 'Noto Sans KR';
	font-style: normal;
	font-weight: 100;
	src: url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Thin.woff2)
		format('woff2'),
		url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Thin.woff)
		format('woff'),
		url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Thin.otf)
		format('opentype');
}

@font-face {
	font-family: 'Noto Sans KR';
	font-style: normal;
	font-weight: 300;
	src: url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Light.woff2)
		format('woff2'),
		url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Light.woff)
		format('woff'),
		url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Light.otf)
		format('opentype');
}

@font-face {
	font-family: 'Noto Sans KR';
	font-style: normal;
	font-weight: 400;
	src: url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Regular.woff2)
		format('woff2'),
		url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Regular.woff)
		format('woff'),
		url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Regular.otf)
		format('opentype');
}

@font-face {
	font-family: 'Noto Sans KR';
	font-style: normal;
	font-weight: 500;
	src: url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Medium.woff2)
		format('woff2'),
		url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Medium.woff)
		format('woff'),
		url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Medium.otf)
		format('opentype');
}

@font-face {
	font-family: 'Noto Sans KR';
	font-style: normal;
	font-weight: 700;
	src: url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Bold.woff2)
		format('woff2'),
		url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Bold.woff)
		format('woff'),
		url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Bold.otf)
		format('opentype');
}

@font-face {
	font-family: 'Noto Sans KR';
	font-style: normal;
	font-weight: 900;
	src: url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Black.woff2)
		format('woff2'),
		url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Black.woff)
		format('woff'),
		url(//fonts.gstatic.com/ea/notosanskr/v2/NotoSansKR-Black.otf)
		format('opentype');
}

body, h1, h2, h3, h4, h5, h6, input, textarea, select {
	font-family: 'Noto Sans KR', sans-serif;
}

.scoreBoard {
	width: 632px;
	border: 1px solid #919191;
	margin: 15px 0;
	text-align: center;
}

.scoreBoardContainer {
	width: 730px !important;
	border: 1px solid #ddd !important;
	border-radius: 10px !important;
	padding: 30px !important;
	box-sizing: border-box;
	margin: 30px 0 0 0;
}

#boxWrap {
	width: auto;
	height: auto;
}

#boxWrap : after {
	content: "";
	display: block;
	clear: both;
}

#boxWrap p+p {
	margin-left: 5px;
}

#boxWrap .original {
	float: left;
	width: 100px;
	height: 100px;
	background-color: #cbcbcb;
	text-align: center;
	line-height: 100px;
}

.btnWrap {
	width: 100%;
}
</style>

</head>
<body class="no-sidebar is-preload">





	<div id="page-wrapper">

		<!-- Header -->
		<div id="header">

			<!-- Inner -->
			<div class="inner">
				<header>
					<h1>
						<a href="./" id="logo">Bowling Score</a>
					</h1>
				</header>
			</div>

			<!-- Nav -->
			<nav id="nav">
				<ul>
					<li><a href="./">Home</a></li>
					<li><a href="#">Game</a>
						<ul>
							<li><a href="./game">게임 시작하기</a></li>
							<li><a href="./record">이전 기록보기</a></li>
						</ul></li>
					<li><a href="./howto">How to Play</a></li>
					<li><a href="./ranking">Ranking</a></li>
				</ul>
			</nav>

		</div>

		<!-- Main -->
		<div class="wrapper style1">

			<!-- 요안에 -->



			<div class="container" align="center">
				<div class="card bg-secondary mb-3" style="max-width: 60rem;"
					align="left">
					<div class="card-body">
						<h3>Score Board</h3>
						<p>각 프레임의 점수를 입력하거나, 원하는 게임세팅을 선택해주세요.</p>






						<!-- 핀버튼-->
						<div class="btn-toolbar-pinButtons" role="toolbar" align="center"
							style="max-width: 100%;">
							<c:forEach var="i" begin="1" end="10">
								<input id="btn${i}" type="button" class="btn-btn-default"
									onclick="roll_go(${i});"
									data-toggle="tooltip" data-placement="bottom"
									title="${i} pin knocked down" value="${i}"
									style="display: inline;"/>
							</c:forEach>


						</div>
						<br>
						
						
						<!-- j는 플레이어 -->
						<c:forEach var="j" begin="1" end="2">
						
						
							<!-- Frame 판 -->
							<div id='scoresheet' style="max-width: 100%;">
								<table id='scoresheetTable' class='scoresheet' cellpadding='1'>
									<tr>
										<!-- frame -->
										<c:forEach var="i" begin="1" end="10">
											<th colspan='6'>Frame ${i}</th>
										</c:forEach>

									</tr>


									<tr>
										<!-- roll입력 -->
										<c:forEach var="i" begin="1" end="10">
											<c:if test="${i eq 10 }">
												<td colspan='2'>1<!-- 10-1 --></td>
												<td colspan='2'>2<!-- 10-2 --></td>
												<td colspan='2'>3<!-- 10-3 --></td>
											</c:if>
											<c:if test="${i ne 10 }">
												<td colspan='3'>1<!-- 1-1 -->
												</td>
												<td colspan='3'>2<!-- 1-2 --></td>
											</c:if>
										</c:forEach>


									</tr>
									<tr>
										<!-- Score입력 -->
										<c:forEach var="i" begin="1" end="10">
											<td colspan='6'>${vo.totalScore}</td>
										</c:forEach>

									</tr>
								</table>
							</div>


						</c:forEach>





					</div>

				</div>




			</div>




		</div>



	</div>






	<!-- Footer -->
	<div id="footer">
		<div class="container">
			<div align="center">
				<!-- Contact -->
				<section class="contact" align="center">
					<header>
						<h3>당신의 퍼펙트게임까지 함께 하겠습니다.</h3>
					</header>

					<p>
						광주광역시 동구 동계천로 76(우) www.comin.com <br> Tel062-653-2879
					</p>
					<ul class="icons">
						<li><a href="#" class="icon brands fa-twitter"><span
								class="label">Twitter</span></a></li>
						<li><a href="#" class="icon brands fa-instagram"><span
								class="label">Instagram</span></a></li>
						<li><a href="#" class="icon brands fa-pinterest"><span
								class="label">Pinterest</span></a></li>
					</ul>
				</section>



			</div>

		</div>
	</div>

	<!-- Scripts -->
	<script>
	function roll_go(num) {
		alert(num);
		
		
		/* 던져보자구 ㅋㅋ */
		// 수정할 프레임, 플레이어 번호, 투구번호, 핀 갯수를 보내기 위한 게임 정보 관련 데이터
		/* var param = { 
			gseq: ${gvo.gseq}, 
			pseq: updatePseq, 
			frame: updateFrame, 
			turn: updateTurn, 
			roll: num,
			remainPin: updateRemainPin,
			PlayerNum : ${gvo.PlayerNum}
		}
		
		$.ajax({
			type: "POST",
			url: "roll",
			data: { gseq: ${gvo.gseq}, rollNum: num },
			success: function(map) {
				setGameInfo("roll", frame, pseq, turn, map, num);
				alert('성공ㅋㅋ');
			}, error: function(req, text) {
				alert(req + " : " + text);
			}
		});
		 */
		
	} //roll_go(num)

	</script>




	<script src="./resources/assets/js/jquery.min.js"></script>
	<script src="./resources/assets/js/jquery.dropotron.min.js"></script>
	<script src="./resources/assets/js/jquery.scrolly.min.js"></script>
	<script src="./resources/assets/js/jquery.scrollex.min.js"></script>
	<script src="./resources/assets/js/browser.min.js"></script>
	<script src="./resources/assets/js/breakpoints.min.js"></script>
	<script src="./resources/assets/js/util.js"></script>
	<script src="./resources/assets/js/main.js"></script>
</body>
</html>