<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<title>BowlingScore-How to</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="./resources/assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="./resources/assets/css/noscript.css" />
</noscript>

<style>
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

.btn-main {
	position: relative;
	display: inline-block;
	background: #df7366;
	color: #fff;
	text-align: center;
	border-radius: 0.5em;
	text-decoration: none;
	padding: 0.65em 3em 0.65em 3em;
	border: 0;
	cursor: pointer;
	outline: 0;
	font-weight: 300;
	-moz-transition: background-color 0.35s ease-in-out, color 0.35s
		ease-in-out, border-bottom-color 0.35s ease-in-out;
	-webkit-transition: background-color 0.35s ease-in-out, color 0.35s
		ease-in-out, border-bottom-color 0.35s ease-in-out;
	-ms-transition: background-color 0.35s ease-in-out, color 0.35s
		ease-in-out, border-bottom-color 0.35s ease-in-out;
	transition: background-color 0.35s ease-in-out, color 0.35s ease-in-out,
		border-bottom-color 0.35s ease-in-out;
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
							<a href="#">How to play</a>
						</h2>
						<p>볼링은 공을 굴려 핀이나 다른 목표물을 쓰러뜨리는 스포츠입니다.</p>
						<img src="./resources/images/howto_pic.jpg"
							style="max-width: 100%; height: auto;" alt="" />
					</header>


					<section>
						<header>
							<h3>볼링의 경기규칙</h3>
						</header>
						<ol>
							<li>볼링의 1게임은 10 프레임으로 구성되어 있습니다.</li>
							<li>각 프레임마다 스트라이크가 나왔을 때를 제외하고2회까지 투구합니다.</li>
							<li>마지막 10 프레임 때 스트라이크, 또는 스페어를 처리하면 3회까지 투구할 수 있습니다.</li>
							<li>한 경기는 인접한 두 레인을 한 쌍으로 매 프레임마다 레인을 이동하며 투구하여 10프레임으로
								종료합니다.</li>
							<li>10 프레임에서 스트라이크나 스페어 처리를 할 경우, 동일 레인에서 제3투구를 진행합니다.</li>
						</ol>

					</section>

					<section>
						<header>
							<h3>볼링 용어</h3>
						</header>
						<ul>
							<li align="left">스트라이크(strike): 각 프레임의 제1구로 10개의 핀 전부를 쓰러뜨리는
								것</li>
							<li align="left">스페어(spare): 제1구로 쓰러뜨리지 못했던 핀을 제2구에서 쓰러뜨리는
								경우</li>
							<li align="left">스플릿(split): 제1구로 1번 핀을 쓰러뜨리고 다른 핀이 떨어져서 남아
								있는 경우</li>
							<li align="left">퍼펙트 게임(perfect game): 1프레임에서 10프레임까지 합계 12구
								전부가 스트라이크인 경우(득점은 300점 만점)</li>
							<li align="left">올 스페어(all spare): 1프레임에서 10프레임까지 모두 스페어로 끝난
								게임. 다만 10프레임의 마지막 1구는 스트라이크라도 좋다.</li>
						</ul>


					</section>

					<footer>
						<a href="./game" class="btn-main">GO</a>
					</footer>
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