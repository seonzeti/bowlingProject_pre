
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<title>Bowling Score - Record</title>
<meta charset="utf-8" />

<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="./resources/assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="./resources/assets/css/noscript.css" />
</noscript>
<style>
.container {
	width: 1200px !important;
	min-height: 580px !important;
	margin-bottom: 35px;
}

.scoreBoardContainer {
	width: 730px !important;
	border: 1px solid #ddd !important;
	border-radius: 10px !important;
	padding: 30px !important;
	box-sizing: border-box;
	margin: 30px 0 0 0;
}

.scoreBoardContainer>div {
	width: 632px !important;
	margin: 0 auto !important;
}

.scoreBoardWrap {
	width: 632px !important;
	position: relative !important;
}

.scoreBoardWrap>h5 {
	width: 100px !important;
	margin: 0 !important;
	font-weight: 700;
}

.scoreBoardWrap>h4 {
	width: 100px !important;
	font-size: 20px !important;
	position: absolute !important;
	top: 0 !important;
	right: 0 !important;
	margin: 0 !important;
	text-align: right !important;
}

.scoreBoard {
	width: 632px;
	border: 1px solid #919191;
	margin: 15px 0;
	text-align: center;
}

.scoreBoard>div {
	line-height: 45px;
	height: 45px;
	overflow: hidden;
}

.scoreBoard>div>div {
	border: 1px solid #919191;
	line-height: 45px;
	height: 45px;
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

			<div class="container">
				<article id="main" class="special">
					<header>
						<h2>
							<a href="#">Record</a>
						</h2>
						<p>이름을 검색해서 나의 기록을 확인해보세요.</p>

					</header>

				</article>

				<div class="container" align="center">
					<div class="card bg-secondary mb-3" style="max-width: 25rem;"
						align="center">
						<div class="card-body">
							<h3>Player Name</h3>
							<br>
							<div class="form-group" align="center">
								<input type="text" class="form-control" id="inputDefault"
									placeholder="이름을 입력하세요.">
							</div>
							<br>
							<button type="button" class="btn btn-dark"
								onclick="location.href='./record'" style="width: 60%">Search</button>

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