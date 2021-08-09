<%@page import="java.util.Date" %>

<%@page import="com.comin.syp.vo.PlayerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<!DOCTYPE HTML>
	
	<html>
	<head>
	<title>BowlingScore-ranking</title>
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
								<a href="#">Ranking</a>
							</h2>
							<p>볼링 스코어의 랭킹을 소개합니다.</p>
	
							<img src="./resources/images/ranking_pic.jpg"
								style="max-width: 100%; height: auto;" alt="" />
						</header>
						<a href="#" class="image featured"><img src="ranking_pic.jpg"
							alt="" /></a>
	
						<table class="table table-hover">
							<thead>
								<tr>
									<th scope="col">등수</th>
									<th scope="col">플레이어 이름</th>
									<th scope="col">점수</th>
									<th scope="col">게임 날짜</th>
								</tr>
							</thead>
	
							<tbody align="center">
	
								
								<%! 
									PlayerVO pvo = new PlayerVO();
									String trClass = "";
									String tdName = pvo.getName();
									int tdScore = pvo.getTotalScore();
									Date tdDate = pvo.getStartDate();
											
								
								%>
	
								<%
								    	// 등수 반복됨 (for문으로 ranking 의 length 까지)
								    	for (int i = 0 ; i < 5 ; i++){
								    		if(i%2==0){
								    			//홀수면
								    			trClass = "table-info";
								    		}else {
								    			//짝수면
								    			trClass = "table-secondary";
								    		}
								    		
								    		
								    		%>
											<tr class="<%= trClass %> ">
												<th scope="row"><%=i+1%>등</th>
												<td><%=tdName%></td>
												<td><%=tdScore%>+1</td>
												<td><%=tdDate%></td>
											</tr>

							<%
							    	}
								    	
						
								    %>
	
							</tbody>
						</table>
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